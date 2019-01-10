package org.pengxx.loveshopping.controller;

import org.pengxx.loveshopping.Employee;
import org.pengxx.loveshopping.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        //模拟从数据库获取值进行登录
        if ("admin".equals(employee.getName()) && "admin".equals(employee.getPassword())){
            return AjaxResult.run();
        }
        return AjaxResult.run().setSuccess(false).setMassage("用户名或密码错误");
    }
}
