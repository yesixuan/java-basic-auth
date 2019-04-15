package cn.vic.forum.service;

import cn.vic.forum.entity.User;

public interface AuthService {

    User register(User userToAdd);
    String login(String username, String password);
}
