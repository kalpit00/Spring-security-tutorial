package com.kalpit00.Spring.security.client.event.listener;

import com.kalpit00.Spring.security.client.entity.User;
import com.kalpit00.Spring.security.client.event.RegistrationCompleteEvent;
import com.kalpit00.Spring.security.client.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Slf4j
public class RegistrationCompleteEventListener implements
        ApplicationListener<RegistrationCompleteEvent> {

    @Autowired
    private UserService userService;

    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
        User user = event.getUser();
        String token = UUID.randomUUID().toString();
        userService.saveVerificationTokenForUser(user, token);
        String url = event.getApplicationUrl() + "/verifyRegistration?token=" + token;

        log.info("Click link to verify your account: {}", url);
    }
}
