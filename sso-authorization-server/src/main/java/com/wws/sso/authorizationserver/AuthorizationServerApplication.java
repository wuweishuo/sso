package com.wws.sso.authorizationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@SpringBootApplication
public class AuthorizationServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(AuthorizationServerApplication.class, args);
    }

}
