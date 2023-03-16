package org.mollcol.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

import javax.annotation.PostConstruct;

@SpringBootApplication(scanBasePackages = "org.mollcol.redis")
public class Redis {
    //生成RedisTemplate对象
    @Autowired
    private RedisTemplate redisTemplate = null;
    //自定义后初始化方法  默认定义一个StringRedisSerializer对象
    @PostConstruct
    public void init() {
        initRedisTemplate();
    }
    private void initRedisTemplate(){
        RedisSerializer stringSerializer = RedisSerializer.string();
        redisTemplate.setKeySerializer(stringSerializer);
        redisTemplate.setHashKeySerializer(stringSerializer);

    }


}
