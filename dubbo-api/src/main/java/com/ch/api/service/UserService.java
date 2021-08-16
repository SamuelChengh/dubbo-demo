package com.ch.api.service;

import com.ch.api.domain.User;

/**
 * @author: CH
 * @date: 2021-08-10
 */
public interface UserService {

    /**
     * 根据用户id，获取用户信息
     *
     * @param id 用户id
     * @return user
     */
    User selectUserById(Long id);

}
