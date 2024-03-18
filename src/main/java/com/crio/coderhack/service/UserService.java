package com.crio.coderhack.service;
/*
 * @author adityagupta
 * @date 18/03/24
 */

import com.crio.coderhack.entity.User;

import java.util.List;

public interface UserService {
    User registerUser(User user);
    User updateUserScore(String userId, int newScore);
    User getUserById(String userId);
    List<User> getAllUsers();

    List<User> getAllUsersSortedByScore();

    void deleteUser(String userId);
}

