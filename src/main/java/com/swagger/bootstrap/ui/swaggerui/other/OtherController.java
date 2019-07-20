package com.swagger.bootstrap.ui.swaggerui.other;

import com.alibaba.fastjson.JSONObject;
import com.swagger.bootstrap.ui.swaggerui.domin.User;
import com.swagger.bootstrap.ui.swaggerui.utils.ResultJson;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("other")
@Api(tags = "其他接口事例")
public class OtherController {

    @PostMapping("/create/user/jsonObject")
    @ApiOperation(value = "使用JSONObject作为参数")
    @ApiOperationSupport(params = @DynamicParameters(name = "CreateUserModel",properties = {
            @DynamicParameter(name = "id",value = "id",example = "X000111",required = true,dataTypeClass = Integer.class),
            @DynamicParameter(name = "name",value = "姓名")
    }))
    public ResultJson<JSONObject> createUserJsonObject(@RequestBody JSONObject jsonObject){
        ResultJson<JSONObject> result = new ResultJson();
        result.setData(jsonObject);
        return result;
    }

    @PostMapping("/create/user/map")
    @ApiOperation(value = "使用Map作为参数")
    @DynamicParameters(name = "CreateUserMapModel",properties = {
            @DynamicParameter(name = "id",value = "id",example = "X000111",required = true,dataTypeClass = Integer.class),
            @DynamicParameter(name = "name",value = "姓名"),
            @DynamicParameter(name = "userName",value = "登录名"),
            @DynamicParameter(name = "orderInfo",value = "订单信息",dataTypeClass = User.class),
    })
    public ResultJson<Map> createUserMap(@RequestBody Map map){
        ResultJson<Map> result = new ResultJson();
        result.setData(map);
        return result;
    }
}
