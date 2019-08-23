package cn.pxy.ysframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableTransactionManagement
public class YsframeworkApplication {
    public static void main(String[] args) {
        SpringApplication.run(YsframeworkApplication.class, args);
    }
}

