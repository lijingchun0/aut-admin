package com.ljc.admin.web;

import com.ljc.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Lijc
 * @Description
 * @Date 2019/6/26-11:35
 **/
@Controller
@RequestMapping("/apiManage")
public class ApiManageController {

    @RequestMapping("/add")
    public String apiAdd(){
        return "apiManage/api-add";
    }
    @RequestMapping("/edit")
    public String apiEdit(){
        return "apiManage/api-add";
    }

}
