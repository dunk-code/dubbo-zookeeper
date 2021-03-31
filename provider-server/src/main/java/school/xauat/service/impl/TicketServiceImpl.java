package school.xauat.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import school.xauat.service.TicketService;


@DubboService
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "一张票";
    }
}
