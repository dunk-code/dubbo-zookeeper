package school.xauat;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class providerServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(providerServerApplication.class, args);
    }

}
