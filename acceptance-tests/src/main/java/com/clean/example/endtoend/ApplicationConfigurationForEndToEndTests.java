package com.clean.example.endtoend;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.clean.example.configuration"})
//,
//        excludeFilters = @ComponentScan.Filter(value = JobSchedulerConfiguration.class,
//                type = FilterType.ASSIGNABLE_TYPE)
public class ApplicationConfigurationForEndToEndTests {
}
