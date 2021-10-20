package com.example.springbootrestful.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yuebuqun
 * @date 2021/10/20 18:14
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Result baseExceptionHandle(Exception exception){
        log.error("[System-Exception] e:", exception);
        return Result.fail();
    }
}
