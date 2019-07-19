package com.example.customspringboot.config.web;

import com.example.customspringboot.config.core.ConditionalOnClass;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(className = "io.undertow.Undertow")
public class UndertowConfiguration {

    private final ServerProperties properties;

    public UndertowConfiguration(ServerProperties properties) {
        this.properties = properties;
    }

    @Bean
    public EmbeddedServletContainerFactory undertowContainerFactory() {
        return new UndertowEmbeddedServletContainerFactory(properties.getPort());
    }

}
