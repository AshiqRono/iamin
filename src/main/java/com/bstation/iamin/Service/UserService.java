package com.bstation.iamin.Service;

import com.bstation.iamin.Entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
