package com.peaceforest.communitymanager.user;

import cn.hutool.core.date.LocalDateTimeUtil;
import com.peaceforest.communitymanager.entity.User;
import com.peaceforest.communitymanager.entity.UserDetail;
import com.peaceforest.communitymanager.mapper.UserDetailMapper;
import com.peaceforest.communitymanager.mapper.UserMapper;
import com.peaceforest.communitymanager.service.UserDetailService;
import com.peaceforest.communitymanager.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class UserTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserDetailMapper userDetailMapper;

    @Autowired
    private UserDetailService userDetailService;

    @Autowired
    private UserMapper userMapper;

    @Test
    void addUser() {
        User user = new User();
        user.setUserId("1");
        user.setUserPassword("123456");
        user.setUserEmail("3174219976@qq.com");
        user.setUserName("张培林");

        userMapper.insert(user);

        UserDetail userDetail = new UserDetail();
        userDetail.setUserId("1");
        userDetail.setRoomNo(1);
        userDetail.setCheckInTime(LocalDateTimeUtil.of(new Date()));
        userDetail.setRoleId(1);

        userDetailMapper.insert(userDetail);

    }

    @Test
    void deleteUser() {
        userMapper.deleteById("2");
    }

    @Test
    void updateUser() {
        User user = new User();
        user.setUserId("2");
//        user.setUserPassword("123456");
        user.setUserEmail("123@qq.com");
//        user.setUserName("admin");
        boolean b = userService.updateById(user);
        System.out.println(b);

    }


}
