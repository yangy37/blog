package com.yiyi.blog.dao;

import com.yiyi.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Yi Yang on 2020/06/07.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);
}
