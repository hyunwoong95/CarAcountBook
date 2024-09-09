package com.first.carAccountBook.service;

import com.first.carAccountBook.mapper.UserMapper;
import com.first.carAccountBook.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<UserVO> getUserList(){
        return userMapper.getUserList();
    }

    public UserVO login(HashMap<String, Object> userInfo){

        int result = userMapper.login(userInfo);
        UserVO vo = new UserVO();

        if(result == 1){
            vo = userMapper.getUserInfo(userInfo);
        }


        return vo;
    }
}
