package com.Atipera_github_task.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String login) {
        super("User '" + login + "' not found");
    }
}
