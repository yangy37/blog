package com.yiyi.blog.service;

import com.yiyi.blog.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
