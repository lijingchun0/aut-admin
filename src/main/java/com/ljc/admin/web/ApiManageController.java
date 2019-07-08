package com.ljc.admin.web;

import com.alibaba.fastjson.JSON;
import com.ljc.admin.service.ApiGroupService;
import com.ljc.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * @Author Lijc
 * @Description
 * @Date 2019/6/26-11:35
 **/
@Controller
@RequestMapping("/apiManage")
public class ApiManageController {

    @Autowired
    ApiGroupService apiGroupService;

    @RequestMapping("/apiAdd")
    public String apiAdd(){
        return "apiManage/api-add";
    }
    @RequestMapping("/apiEdit")
    public String apiEdit(){
        return "apiManage/api-add";
    }
    @RequestMapping("/apiGroupEdit")
    public String apiGroupEdit(){
        return "apiManage/api-edit";
    }

    @GetMapping("/apiGroupInfo")
    @ResponseBody
    public String apiGroupInfo(@RequestParam("name")String name,@RequestParam("host")String host){
        System.out.println("======"+apiGroupService.getApiGroupInfo(name,host).get(1).getApiUser().getUser());

        return JSON.toJSONString(apiGroupService.getApiGroupInfo(name,host));
    }
}
