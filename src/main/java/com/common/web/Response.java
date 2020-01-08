package com.common.web;

import lombok.Data;

/**
 * @author zouyang {@literal <zouyang@baijiahulian.com>}
 */
@Data
public class Response<T> {
    private String rid;
    private Integer code;
    private T data;
    private String msg;

    private Response(ResponseCode responseCode) {
        code = responseCode.getCode();
        msg = responseCode.getMsg();
    }

    public static <T> Response<T> newSuccess(T data) {
        final Response<T> instance = new Response<>(ResponseCode.SUCCESS);
        instance.setData(data);
        return instance;
    }

    public static Response<String> newSuccess() {
        return new Response<>(ResponseCode.SUCCESS);
    }

    public static Response newError() {
        return new Response(ResponseCode.ERROR);
    }

    public static Response newError(ResponseCode responseCode) {
        final Response<Object> instance = new Response<>(responseCode);
        return instance;
    }

    public static Response newError(ResponseCode responseCode, String msg) {
        final Response<Object> instance = new Response<>(responseCode);
        instance.setMsg(msg);
        return instance;
    }

    public static Response newError(String msg) {
        final Response<Object> instance = new Response<>(ResponseCode.ERROR);
        instance.setMsg(msg);
        return instance;
    }

    public static <T> Response<T> newErrorWithData(ResponseCode responseCode, T data) {
        final Response<T> instance = new Response<>(responseCode);
        instance.setData(data);
        return instance;
    }
}
