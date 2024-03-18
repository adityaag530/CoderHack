package com.crio.coderhack.service;
/*
 * @author adityagupta
 * @date 18/03/24
 */
import com.crio.coderhack.entity.User;
import com.crio.coderhack.exception.UserNotFoundException;
import com.crio.coderhack.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUserScore(String userId, int newScore) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException("User not found"));
        user.setScore(newScore);
        user.updateBadges();
        return userRepository.save(user);
    }

    @Override
    public User getUserById(String userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException("User not found"));
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<User> getAllUsersSortedByScore() {

        List<User> users = userRepository.findAll();

        Collections.sort(users, Comparator.comparingInt(User::getScore).reversed());

        return users;
    }

    @Override
    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }
}
