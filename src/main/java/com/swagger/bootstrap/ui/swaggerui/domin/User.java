package com.swagger.bootstrap.ui.swaggerui.domin;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description= "用户实体类")
public class User {
    @ApiModelProperty("用户ID")
    private Integer id;
    @ApiModelProperty("用户名称")
    private String name;
    @ApiModelProperty("用户年龄")
    private Integer age;
    @ApiModelProperty("用户地址")
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
