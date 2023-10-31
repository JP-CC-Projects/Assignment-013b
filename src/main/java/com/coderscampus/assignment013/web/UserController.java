package com.coderscampus.assignment013.web;

import com.coderscampus.assignment013.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
}
