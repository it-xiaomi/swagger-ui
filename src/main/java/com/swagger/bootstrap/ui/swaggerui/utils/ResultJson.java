package com.swagger.bootstrap.ui.swaggerui.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description= "返回结果信息")
public class ResultJson<T> {

    @ApiModelProperty("响应业务状态")
    private Integer status;

    @ApiModelProperty("响应消息")
    private String msg;

    @ApiModelProperty("响应中的数据")
    private T data;

    public ResultJson() {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public ResultJson (T data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
