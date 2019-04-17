package com.valentinaitken.test.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.valentinaitken.test")
@EntityScan(basePackages = "com.valentinaitken.test")
@EnableJpaRepositories(basePackages = "com.valentinaitken.test")
@Configuration
public class TestsConfiguration {
}
