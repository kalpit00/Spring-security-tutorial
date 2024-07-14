package com.kalpit00.Spring.security.client.service;

import com.kalpit00.Spring.security.client.entity.User;
import com.kalpit00.Spring.security.client.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);

    void saveVerificationTokenForUser(User user, String token);
}
