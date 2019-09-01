package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/getAddress/{memberId}")
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(@PathVariable("memberId") String memberId){
        List<UmsMemberReceiveAddress> list = userService.getReceiveAddressByMemberId(memberId);
        return list;
    }


    @RequestMapping("/getAllUser")
    public List<UmsMember> getAllUser(){
        List<UmsMember> allUser = userService.getAllUser();
        return allUser;
    }


    @RequestMapping("/index")
    public String index(){
        return "hello user";
    }

}
