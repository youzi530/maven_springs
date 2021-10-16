package com.hc.springConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration //相当于beans
@ComponentScan("com.hc")  //component-scan
@Import({DateConfig.class,JDBCConfig.class})

@PropertySource("classpath:jdbc.properties")
public class SpringConfig {

}
