package com.ljc.admin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @Author Lijc
 * @Description
 * @Date 2019/7/2-15:16
 **/
@Data
@ToString
@TableName("api_group")
public class ApiGroup implements Serializable {

    private String id;
    private String name;
    private String host;
    private String createTime;
    private String createUserId;
    private String describe;
    private ApiUser apiUser;
}
