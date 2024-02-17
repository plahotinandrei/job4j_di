package ru.job4j.lifecycl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.job4j.lifecycl.model.Product;

@Configuration
public class Config {

    @Bean(name = "myProduct",
            initMethod = "initMethod",
            destroyMethod = "destroyMethod"
    )
    public Product getProduct() {
        return new Product("Good Product", 2.5);
    }
}
