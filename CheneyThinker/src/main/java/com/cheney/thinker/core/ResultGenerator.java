package com.cheney.thinker.core;

/**
 * @Description 响应结果生成工具
 * @author CheneyThinker
 * @date 2018/4/8
 */
public class ResultGenerator {

    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";
    private static final String DEFAULT_FAIL_MESSAGE = "FAIL";

    public static Result genSuccessResult() {
        return new Result().
                setCode(ResultCode.OK).
                setMsg(DEFAULT_SUCCESS_MESSAGE);
    }

    public static Result genSuccessResult(Object data) {
        return new ResultData().
                setData(data).
                setCode(ResultCode.OK).
                setMsg(DEFAULT_SUCCESS_MESSAGE);
    }

    public static Result genFailResult() {
        return new Result().
                setCode(ResultCode.BAD_REQUEST).
                setMsg(DEFAULT_FAIL_MESSAGE);
    }
    
    public static Result genFailResult(String msg) {
        return new Result()
                .setCode(ResultCode.BAD_REQUEST)
                .setMsg(msg);
    }

}
