package com.crio.coderhack.service;

import com.crio.coderhack.entity.User;
import com.crio.coderhack.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userService;

    @Test
    public void testRegisterUser() {
        String username = "testUser";
        User user = new User(username);
        when(userRepository.save(any(User.class))).thenReturn(user);
        User savedUser = userService.registerUser(user);
        assertEquals(username, savedUser.getUsername());
    }

    @Test
    public void testUpdateUserScore() {
        String userId = "123";
        int newScore = 50;
        User user = new User("testUser");
        user.setUserId(userId);
        when(userRepository.findById(userId)).thenReturn(Optional.of(user));
        when(userRepository.save(any(User.class))).thenReturn(user);
        User updatedUser = userService.updateUserScore(userId, newScore);
        assertEquals(newScore, updatedUser.getScore());
    }

    // Additional unit tests for other methods
}
