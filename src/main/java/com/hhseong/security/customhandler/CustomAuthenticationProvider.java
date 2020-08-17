package com.hhseong.security.customhandler;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider implements AuthenticationManager {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String user_id = (String)authentication.getPrincipal();

        String user_pw = (String)authentication.getCredentials();

        System.out.println(user_id);
        System.out.println(user_pw);

        System.out.println(1);
        return null;
    }
}
