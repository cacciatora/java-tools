package com.common.web;

/**
 * @author zouyang {@literal <zouyang@baijiahulian.com>}
 */
public enum ResponseCode {
    // http response 实体状态码
    SUCCESS(0, "操作成功"),
    ERROR(1, "操作失败"),
    RESPONSE_NOT_FOUND(404, "资源不存在"),
    NEED_LOGIN(403, "请登录"),
    NO_PERMISSION(400, "无权限"),
    ;

    private final int code;
    private final String msg;

    ResponseCode(int i, String msg) {
        this.code = i;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
