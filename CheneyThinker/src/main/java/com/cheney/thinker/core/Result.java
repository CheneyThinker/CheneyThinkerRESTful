package com.cheney.thinker.core;

/**
 * @Description 统一API响应结果封装
 * @author CheneyThinker
 * @date 2018/4/8
 */
public class Result {

    protected Integer code;
    protected String msg;

    public Result setCode(ResultCode resultCode) {
        this.code = resultCode.code();
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public Result setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public String getMsg() {
        return msg;
    }

}
