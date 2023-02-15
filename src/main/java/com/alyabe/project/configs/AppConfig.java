package com.alyabe.project.configs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Loyalty System Api")
                                .version("1.0.0")
                                .contact(
                                        new Contact()
                                                .email("atas0231@gmail.com")
                                                .url("")
                                                .name("kalenov Abay")
                                )
                );
    }

}
