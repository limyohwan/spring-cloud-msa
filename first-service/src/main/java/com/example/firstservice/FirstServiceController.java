package com.example.firstservice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/first-service")
@Slf4j
public class FirstServiceController {
    Environment env;

    public FirstServiceController(Environment env) {
        this.env = env;
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome to the first sercice";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("first-request") String header){
        log.info(header);
        return "hello world in first service";
    }

    @GetMapping("/check")
    public String check(HttpServletRequest request){
        log.info("Server port = {}", request.getServerPort());
        return String.format("HI there this is a message first service on PORT %s", env.getProperty("local.server.port"));
    }
}
