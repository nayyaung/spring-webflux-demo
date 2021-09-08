package com.webfluxdemo.reactiverestservice;

import com.webfluxdemo.hello.GreetingClient;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.webfluxdemo")
public class ReactiveRestServiceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
        SpringApplication.run(ReactiveRestServiceApplication.class, args);
        GreetingClient greetingClient = context.getBean(GreetingClient.class);
        System.out.println(">> message = " + greetingClient.getMessage().block());
    }

}
