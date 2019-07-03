package com.ljc.admin.dao;

import com.ljc.admin.entity.ApiGroup;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ApiGroupMapper {
    List<ApiGroup> getApiGroupInfo(@Param("name")String name,@Param("host")String host);
}
