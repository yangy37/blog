package com.yiyi.blog.service;

import com.yiyi.blog.dao.UserRepository;
import com.yiyi.blog.po.User;
import com.yiyi.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class UserServiceImpl implements  UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User checkUser(@RequestParam String username, @RequestParam String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
