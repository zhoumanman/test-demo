package com.demo.service;

import com.demo.config.UserProperties;

public class UserClient {
    private UserProperties userProperties;

    public UserClient() {}

    public UserClient(UserProperties p) {
        this.userProperties = p;
    }

    public String getName() {
        return userProperties.getName();
    }
}
