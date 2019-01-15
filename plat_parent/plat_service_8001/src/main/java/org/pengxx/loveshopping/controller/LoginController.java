package org.pengxx.loveshopping.controller;

import org.pengxx.loveshopping.Employee;
import org.pengxx.loveshopping.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    /**
     * 参数: Employee
     * 返回值:登录是否成功 AjaxResult
     */

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    //以后传递对象前太都要用json对象{},[],后台通过(@RequestBody
    public AjaxResult login(@RequestBody Employee employee){

        //正常来说需要到数据库通过用户名查询用户,查询出来判断是否为空,如果不为空还要比对密码
        if ("admin".equals(employee.getName())&&"admin".equals(employee.getPassword())){
            return AjaxResult.me();
        }
        return AjaxResult.me().setSuccess(false).setMessage("用户名或密码不正确!");
    }
}
