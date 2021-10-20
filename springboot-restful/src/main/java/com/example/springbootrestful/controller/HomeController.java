package com.example.springbootrestful.controller;

import com.example.springbootrestful.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuebuqun
 * @date 2021/10/20 11:29
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public Result index() {
        if(1 == 1){
            throw new RuntimeException("1232");
        }
        return Result.success("index");
    }
}
