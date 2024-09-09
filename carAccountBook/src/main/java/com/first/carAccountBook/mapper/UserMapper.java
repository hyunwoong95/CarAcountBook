package com.first.carAccountBook.mapper;

import com.first.carAccountBook.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    public List<UserVO> getUserList();
    public UserVO getUserInfo(HashMap<String, Object> userInfo);

    public int login(HashMap<String, Object> userInfo);
}
