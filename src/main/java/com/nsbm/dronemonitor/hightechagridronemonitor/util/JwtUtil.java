package com.nsbm.dronemonitor.hightechagridronemonitor.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtil {
    private final String SECRET = "YourSecret"; // Move to configuration

    public String generateToken(String username) {
        return JWT.create()
                .withSubject(username)
                .withExpiresAt(new Date(System.currentTimeMillis() + 3600 * 1000)) // 1 hour
                .sign(Algorithm.HMAC512(SECRET));
    }
}
