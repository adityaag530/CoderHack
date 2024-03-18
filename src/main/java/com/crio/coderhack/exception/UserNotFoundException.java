package com.crio.coderhack.exception;
/*
 * @author adityagupta
 * @date 18/03/24
 */

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
