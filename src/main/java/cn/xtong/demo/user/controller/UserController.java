package cn.xtong.demo.user.controller;

import cn.xtong.demo.user.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
@Api(tags = "用户管理")
public class UserController {

    @GetMapping("/list")
    @ApiOperation(value="查询用户列表", notes="返回所有用户数据")
    public List<User> getUserList(@Parameter(description = "用户名") @RequestParam(value = "username", required = false) String userName) {
        List<User> result = new ArrayList<>();
        result.add(new User("zhangsan", "zhangsan@qq.com"));
        result.add(new User("lisi", "lisi@qq.com"));
        return result;
    }
}