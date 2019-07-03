package com.ljc.admin.service.impl;

import com.ljc.admin.dao.ApiGroupMapper;
import com.ljc.admin.dao.ApiUserMapper;
import com.ljc.admin.entity.ApiGroup;
import com.ljc.admin.service.ApiGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Lijc
 * @Description
 * @Date 2019/7/3-15:07
 **/
@Service
public class ApiGroupServiceImpl implements ApiGroupService {
    @Autowired
    ApiGroupMapper apiGroupMapper;

    @Override
    public List<ApiGroup> getApiGroupInfo(String name, String host) {
        return apiGroupMapper.getApiGroupInfo(name,host);
    }
}
