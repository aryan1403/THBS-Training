package com.example.demo;

public class response {
    String code;
    String msg;
    Object data;
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public response(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    
}
