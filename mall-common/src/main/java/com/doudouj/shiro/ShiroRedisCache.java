package com.doudouj.shiro;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Collection;
import java.util.Set;

/**
 * @ClassName: ShiroRedisCache
 * @Author: doudou
 * @Datetime: 2019/12/6-9:54
 * @Description: Cache实现类
 */
public class ShiroRedisCache<K, V> implements Cache<K, V> {

    private RedisTemplate redisTemplate;
    private String prefix = "shiro_redis";

    public String getPrefix() {
        return prefix + ":";
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public ShiroRedisCache(RedisTemplate redisTemplate, String prefix) {
        this.redisTemplate = redisTemplate;
        this.prefix = prefix;
    }

    public ShiroRedisCache(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public V get(K k) throws CacheException {
        if (k == null) return null;
        return (V) redisTemplate.opsForValue().get(k);
    }

    @Override
    public V put(K k, V v) throws CacheException {
        if (k == null) return null;
        redisTemplate.opsForValue().set(k, v);
        return v;
    }

    @Override
    public V remove(K k) throws CacheException {
        if (k == null) return null;
        V v = (V) redisTemplate.opsForValue().get(k);
        redisTemplate.delete(k);
        return v;
    }

    @Override
    public void clear() throws CacheException {
        redisTemplate.getConnectionFactory().getConnection().flushDb();
    }

    @Override
    public int size() {
        return redisTemplate.getConnectionFactory().getConnection().dbSize().intValue();
    }

    @Override
    public Set<K> keys() {
        return redisTemplate.keys(getPrefix() + "*");
    }

    @Override
    public Collection<V> values() {
        return null;
    }
    //https://blog.iliujing.com/blog/articles/2018/08/29/1535530350587.html
}
