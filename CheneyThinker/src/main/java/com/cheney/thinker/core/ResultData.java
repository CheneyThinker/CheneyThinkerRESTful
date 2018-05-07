package com.cheney.thinker.core;

/**
 * @Description 统一API响应结果封装
 * @author CheneyThinker
 * @date 2018/4/8
 */
public class ResultData extends Result {

    private Object data;

    public ResultData setData(Object data) {
        this.data = data;
        return this;
    }

    public Object getData() {
        return data;
    }

}
