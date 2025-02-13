package com.mystore.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Product tumbler() {
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Tumbler");
        return p1;
    }

    @Bean
    public Product bucket() {
        Product p2 = new Product();
        p2.setId(2);
        p2.setName("Bucket");
        return p2;
    }
}
