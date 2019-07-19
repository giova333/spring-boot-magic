package com.example.customspringboot.config.web;

import com.example.customspringboot.config.core.ConditionalOnClass;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(className = "org.apache.catalina.startup.Tomcat")
public class TomcatConfiguration {

    private final Integer port;

    public TomcatConfiguration(@Value("${port}") Integer port) {
        this.port = port;
    }

    @Bean
    EmbeddedServletContainerFactory servletContainerFactory() {
        return new TomcatEmbeddedServletContainerFactory(port);
    }

}
