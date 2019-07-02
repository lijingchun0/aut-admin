package com.ljc.admin.web;

import com.ljc.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author Lijc
 * @Description
 * @Date 2019/7/2-17:14
 **/
@Controller
public class LoginController {

    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public String login() {
        return "login";
    }



    @PostMapping(value = "/loginTo")
    public ResponseEntity<Object> ss(@RequestParam(value = "username") String user,
                                     @RequestParam(value = "password") String pwd, ModelMap modelMap) {

        if (StringUtils.isEmpty(userService.userInfo(user))) {
            return new ResponseEntity<>("用户不存在", HttpStatus.EXPECTATION_FAILED);
        }if (!userService.userInfo(user).getPwd().equals(pwd)) {
            return new ResponseEntity<Object>("密码错误", HttpStatus.EXPECTATION_FAILED);
        }
        return new ResponseEntity<>(userService.userInfo(user).toString(),HttpStatus.OK);
    }
}
