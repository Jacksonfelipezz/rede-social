package com.jackson.rede_social.config;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@Configuration
@Hidden // Hides this controller itself from the Swagger documentation
public class SwaggerConfig {

    @GetMapping("/")
    public ResponseEntity<Void> redirectSwagger() {
        return ResponseEntity.status(HttpStatus.FOUND)
                .location(URI.create("/swagger-ui/index.html"))
                .build();
    }

    @Bean
    public OpenAPI customAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("REDE-SOCIAL")
                        .version("1.0.0")
                        .description("API documentada de Social Media projeto")
                        .license(new License()
                                .name("Licenca do Sistema")
                                .url("https://www.jackson.com"))
                );
    }
}
