package com.example.springbootrestful.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yuebuqun
 * @date 2021/10/20 11:30
 */
@Data
public class Result<T> implements Serializable {
    private int code;
    private String message;
    private T data;

    public Result() {
    }

    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(ResultCodeEnum resultCodeEnum) {
        this.code = resultCodeEnum.getCode();
        this.message = resultCodeEnum.getMessage();
    }

    public Result(ResultCodeEnum resultCodeEnum, T data) {
        this.code = resultCodeEnum.getCode();
        this.message = resultCodeEnum.getMessage();
        this.data = data;
    }


    public static Result success() {
        return new Result(ResultCodeEnum.SUCCESS);
    }


    public static <T> Result success(T data) {
        return new Result(ResultCodeEnum.SUCCESS, data);
    }

    public static Result fail() {
        return new Result(ResultCodeEnum.FAILED);
    }

    public static <T> Result<?> forbidden(T data) {
        return new Result<>(ResultCodeEnum.FORBIDDEN, data);
    }


}
