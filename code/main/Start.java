package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Start {
    public static void main(String[] data) {
        ApplicationContext context;
        context = SpringApplication.run(Setup.class);
    }
}

@SpringBootApplication
class Setup {
    @Bean
    DriverManagerDataSource create() {
        return new DriverManagerDataSource(conntectionString);
    }
            
            
    String conntectionString = 
            "jdbc:mysql://127.0.0.1" + "/shop?user=peter&password=parker";
}

@RestController
class Sample {
    @RequestMapping("/check")
    double showCheck() { 
        return 123.4567; 
    }
}