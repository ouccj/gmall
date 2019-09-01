package com.atguigu.gmall.user;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallUserApplicationTests {

    @Autowired
    UserService userService;
    
    @Autowired
    UserMapper userMapper;

    @Test
    public void contextLoads() {
        List<UmsMember> list = userService.getAllUser();
        for(UmsMember user : list){
            System.out.println(user);
        }
    }

    @Test
    public void selectAddress() {
        List<UmsMemberReceiveAddress> memberReceiveAddresses = userMapper.selectAddress("1");
        for(UmsMemberReceiveAddress umsMemberReceiveAddress : memberReceiveAddresses){
            System.out.println(umsMemberReceiveAddress);
        }
    }

}
