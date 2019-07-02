package com.ljc.admin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Lijc
 * @Description
 * @Date 2019/6/24-16:12
 **/
@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/welcome")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping("/list")
    public String list() {
        return "apiManage/list";
    }

    @RequestMapping("/apiGroup")
    public String apiGroup() {
        return "apiManage/apiGroup";
    }

}
