package org.mollcol.service.Impl;

import org.mollcol.mapper.userMapper;
import org.mollcol.model.entity.user;
import org.mollcol.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private userMapper userMapper;
    @Override
    public user selectById(String id) {
        user user = new user();
        user = userMapper.selectById(id);
        return user;

    }
}
