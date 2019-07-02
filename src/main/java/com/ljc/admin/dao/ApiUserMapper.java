package com.ljc.admin.dao;

import com.ljc.admin.entity.ApiUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface ApiUserMapper {
    ApiUser getUserInfo(@Param("user") String user);
}
