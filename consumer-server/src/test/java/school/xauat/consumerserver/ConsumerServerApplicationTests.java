package school.xauat.consumerserver;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import school.xauat.service.UserService;

@SpringBootTest
class ConsumerServerApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        String ticket = userService.buyTicket();
        System.out.println("从注册中心获得的票====>" + ticket);
    }

}
