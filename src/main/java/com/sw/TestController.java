package com.sw;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vie1224 on 2018/4/2.
 */
@RestController
public class TestController {

    @RequestMapping("hello")
    public String hello(){

        return "hello";

    }

}
