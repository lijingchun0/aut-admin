package com.ljc.admin.service.impl;

import com.ljc.admin.dao.ApiUserMapper;
import com.ljc.admin.entity.ApiUser;
import com.ljc.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author Lijc
 * @Description
 * @Date 2019/6/28-14:26
 **/
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private ApiUserMapper apiUserMapper;

    @Override
    public ApiUser userInfo(String user) {
        return apiUserMapper.getUserInfo(user);
    }
}
