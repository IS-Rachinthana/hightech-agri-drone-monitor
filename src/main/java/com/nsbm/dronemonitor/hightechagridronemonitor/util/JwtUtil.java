package com.nsbm.dronemonitor.hightechagridronemonitor.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Component;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;

import java.util.Date;

@Component
public class JwtUtil {
    private final String SECRET = "YourSecret"; // Move to configuration

    public String generateToken(String userEmail) {
        return JWT.create()
                .withSubject(userEmail)
                .withExpiresAt(new Date(System.currentTimeMillis() + 18000 * 1000)) // 1 hour
                .sign(Algorithm.HMAC512(SECRET));
    }

    public String DecryptToken(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC512(SECRET);
            JWTVerifier verifier = JWT.require(algorithm)
                    .build(); //Reusable verifier instance
            DecodedJWT jwt = verifier.verify(token);
            return jwt.getSubject();
        } catch (JWTVerificationException exception){
            //Invalid signature/claims
            return null;
        }
    }
}
