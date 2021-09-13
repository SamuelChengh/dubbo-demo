package com.ch.provider.service;

import com.ch.api.domain.User;
import com.ch.api.service.UserService;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: CH
 * @date: 2021-08-10
 */
@Service(version = "1.0")
public class UserServiceImpl implements UserService {

    private final static int SIZE = 5;

    private static List<User> userList = new ArrayList<>();

    static {
        for (int i = 1; i <= SIZE; i++) {
            User user = new User();
            user.setId((long) i);
            user.setName("亚历山大" + i + "世");
            userList.add(user);
        }
    }

    @Override
    public User selectUserById(Long id) {
        for (User user : userList) {
            if (id.equals(user.getId())) {
                return user;
            }
        }
        return null;
    }
}
