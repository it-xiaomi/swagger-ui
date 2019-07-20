package com.swagger.bootstrap.ui.swaggerui.controller;

import com.swagger.bootstrap.ui.swaggerui.domin.User;
import com.swagger.bootstrap.ui.swaggerui.utils.ResultJson;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("ordinary")
@Api(tags = "普通接口事例")
public class OrdinaryController {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ApiOperation(value = "测试", notes = "测试")
    @ApiImplicitParams({
            @ApiImplicitParam(name="companyName", value = "公司名称")
    })
    public ResultJson<User> testDB(@RequestParam(value = "companyName", required = false) String companyName) {

        List<User> list = new ArrayList<>();

        User user = new User();
        user.setId(1);
        user.setName("xiaomi");
        user.setAge(18);
        user.setAddress("北京昌平");

        User user1 = new User();
        user1.setId(2);
        user1.setName("张三");
        user1.setAge(18);
        user1.setAddress("上海");
        list.add(user);
        list.add(user1);

        return new ResultJson(list);
    }

}
