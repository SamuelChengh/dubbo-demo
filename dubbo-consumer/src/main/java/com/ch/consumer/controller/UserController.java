package com.ch.consumer.controller;

import com.ch.api.domain.User;
import com.ch.api.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: CH
 * @date: 2021-08-10
 */
@RestController
public class UserController {

    @Reference(version = "1.0", parameters = {"unicast", "false"})
    private UserService userService;

    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
    public User getById(@PathVariable Long id) {
        return userService.selectUserById(id);
    }

}
