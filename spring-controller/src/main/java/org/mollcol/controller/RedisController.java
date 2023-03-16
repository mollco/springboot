package org.mollcol.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate = null;
    @RequestMapping("/stringAndHash")
    @ResponseBody
    public Map<String,Object> testStringAndHash(){
        redisTemplate.opsForValue().set("key","value1");
        redisTemplate.opsForValue().set("int_key","1");
        //获取redis数据类型操作接口
        //获取字符串操作接口
        stringRedisTemplate.opsForValue().set("int_key","1");
        stringRedisTemplate.opsForValue().set("int","1");
        //
       // stringRedisTemplate.opsForValue().increment("int","1");
        Jedis jedis = (Jedis)stringRedisTemplate.getConnectionFactory().getConnection().getNativeConnection();
        jedis.decr("int");
        Map<String,String>hash = new HashMap<String,String>();
        hash.put("file","value1");
        hash.put("file2","value2");
        stringRedisTemplate.opsForHash().putAll("hash",hash);
        stringRedisTemplate.opsForHash().put("hash","field3","value3");
        BoundHashOperations hashOps = stringRedisTemplate.boundHashOps("hash");
        hashOps.delete("file","file2");
        hashOps.put("field4","value5");
        Map<String,Object>map = new HashMap<>();
        map.put("success",true);
        return  map;

    }
}
