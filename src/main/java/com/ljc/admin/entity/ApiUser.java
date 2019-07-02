package com.ljc.admin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

/**
 * @Author Lijc
 * @Description
 * @Date 2019/6/26-21:55
 **/
@Data
@ToString
@TableName("api_user")
public class ApiUser {

    private String id;
    private String user;
    private String pwd;
    private String email;

}
