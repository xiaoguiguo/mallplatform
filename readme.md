### 自动生成代码

mybatis-generator，自动生成实体类、dao和mapper文件

resource目录下的GenerateScripts目录下的文件，在mall-generator项目下的pom.xml文件中配置各个数据库配置文件，会自动生成相对应的代码。
配置完文件之后，在mall-generate目录下使用maven命令：mvn install就可以生成代码咯。

![1574341253054](https://github.com/doudouCN/mallplatform/raw/master/resource/pic/1574341253054.png)

![1574341288393](https://github.com/doudouCN/mallplatform/raw/master/resource/pic/1574341288393.png)

#### 使用lombok
自动生成的代码DTO中都带有set、get方法，使用@Data注解简化代码， Date类型都统一更换为LocalDateTime