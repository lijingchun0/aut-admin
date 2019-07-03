package com.ljc.admin.service;

import com.ljc.admin.entity.ApiGroup;

import java.util.List;

/**
 * @Author Lijc
 * @Description
 * @Date 2019/7/3-15:05
 **/
public interface ApiGroupService {
    List<ApiGroup> getApiGroupInfo(String name,String host);
}
