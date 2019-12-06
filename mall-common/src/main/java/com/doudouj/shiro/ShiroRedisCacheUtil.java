package com.doudouj.shiro;

import org.apache.shiro.cache.AbstractCacheManager;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @ClassName: ShiroRedisCacheUtil
 * @Author: doudou
 * @Datetime: 2019/12/6-9:47
 * @Description: TODO
 */
public class ShiroRedisCacheUtil extends AbstractCacheManager {

    private RedisTemplate<String, byte[]> redisTemplate;

    @Override
    protected Cache createCache(String s) throws CacheException {
//        return new ShiroRedis
        return null;
    }
}
