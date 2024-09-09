package com.first.carAccountBook.controller;

import com.first.carAccountBook.service.UserService;
import com.first.carAccountBook.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getLoginPage", method = RequestMethod.GET)
    public String getLogin(){
        System.out.println("login page");
        return "user/login";
    }

    @RequestMapping(value= "/login", method = RequestMethod.POST)
    public UserVO login(String id, String password){

        HashMap<String, Object> userInfo = new HashMap<>();
        userInfo.put("id",id);
        userInfo.put("password",password);

        UserVO vo = userService.login(userInfo);

        return vo;
    }



    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public String TestPage(){
        System.out.println("test page");
        return "user/test";
    }

    @ResponseBody
    @RequestMapping(value = "/getUserList", method = RequestMethod.POST)
    public List<UserVO> getUserList(){
        List<UserVO> list = userService.getUserList();
        System.out.println("list length: " + list.size());

        return list;
    }


}
