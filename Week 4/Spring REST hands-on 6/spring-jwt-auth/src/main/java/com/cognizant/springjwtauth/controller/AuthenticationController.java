package com.cognizant.springjwtauth.controller;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        LOGGER.info("START");
        LOGGER.debug("Authorization Header: {}", authHeader);

        Map<String, String> result = new HashMap<>();
        String user = getUser(authHeader);
        String token = generateJwt(user);
        result.put("token", token);

        LOGGER.info("END");
        return result;
    }

    private String getUser(String authHeader) {
        LOGGER.info("START");
        String encodedCredentials = authHeader.substring("Basic ".length()); // 
        byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials); // [cite: 1136, 1137]
        String decodedString = new String(decodedBytes); // [cite: 1138]
        String user = decodedString.substring(0, decodedString.indexOf(":")); // 
        LOGGER.debug("Decoded User: {}", user);
        LOGGER.info("END");
        return user; // [cite: 1140]
    }

    private String generateJwt(String user) {
        LOGGER.info("START");
        JwtBuilder builder = Jwts.builder(); // 
        builder.setSubject(user); // 
        builder.setIssuedAt(new Date()); // Set the token issue time as current time 
        builder.setExpiration(new Date((new Date()).getTime() + 1200000)); // Set expiry to 20 minutes from now (1200000 ms) 
        builder.signWith(SignatureAlgorithm.HS256, "secretkey"); // 
        String token = builder.compact(); // 
        LOGGER.debug("Generated Token: {}", token);
        LOGGER.info("END");
        return token; // [cite: 1164]
    }
}