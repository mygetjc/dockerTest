package com.dockertest.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @description:
 * @author: jc
 * @time: 2020/3/12 18:17
 */
@Controller
public class TestController {


    @ResponseBody
    @RequestMapping("/test")
    public String redisTest(HttpServletRequest request) {

        return "1212";
    }
}
