package com.kalpit00.Spring.security.client.service;

import com.kalpit00.Spring.security.client.entity.User;
import com.kalpit00.Spring.security.client.entity.VerificationToken;
import com.kalpit00.Spring.security.client.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);

    void saveVerificationTokenForUser(User user, String token);

    String validateVerificationToken(String token);

    VerificationToken generateNewVerificationToken(String oldToken);

    User findUserByEmail(String email);

    void createPasswordResetTokenForUser(User user, String token);

    String validatePasswordResetToken(String token);
}
