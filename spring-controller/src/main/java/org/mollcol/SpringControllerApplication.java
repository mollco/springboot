package org.mollcol;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@ComponentScan(basePackages = {"org.mollcol.service"})
@MapperScan("org.mollcol.mapper")
@Configuration
public class SpringControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringControllerApplication.class, args);
    }

}
