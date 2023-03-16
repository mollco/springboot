package org.mollcol.controller;

import org.mollcol.model.entity.user;
import org.mollcol.service.userService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class testController {

    @RequestMapping("/indexJSP")
    @ResponseBody
    public String  test() {
        return  "index";
    }
}
