package com.mystore.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load the Spring context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get beans from Spring context
        Product p1 = context.getBean("tumbler", Product.class);
        Product p2 = context.getBean("bucket", Product.class);

        // Display Products
        System.out.println(p1);
        System.out.println(p2);
    }
}
