package com.ljc.admin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

/**
 * @Author Lijc
 * @Description
 * @Date 2019/7/2-15:16
 **/
@Data
@ToString
@TableName("api_group")
public class ApiGroup {

    private String id;
    private String name;
    private String host;
    private String createTime;
    private String createUserId;
}
