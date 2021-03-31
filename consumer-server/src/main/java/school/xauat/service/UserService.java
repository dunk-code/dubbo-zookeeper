package school.xauat.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service //放入到spring容器中
public class UserService {

    @Reference//引用 pom坐标，可以在消费者端定义一个路径完全一样的接口
    TicketService ticketService;

    public String buyTicket() {
        return ticketService.getTicket();
    }

}
