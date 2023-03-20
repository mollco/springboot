package org.mollcol.controller;

import org.mollcol.model.entity.user;
import org.mollcol.service.userService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController


public class UserController {

    @Autowired
    private userService userService;
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/view")
    @ResponseBody
    public user test(@RequestParam String user) {
        logger.info("请求参数{}", user);
        user result = userService.selectById(user);
        return result;
    }
}
