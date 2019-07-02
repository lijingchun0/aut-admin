package com.ljc.admin;

import com.ljc.admin.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AutAdminApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
    }


}
