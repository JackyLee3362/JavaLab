package cn.itcast.hotel.mq;

import cn.itcast.hotel.constants.MqConstants;
import cn.itcast.hotel.service.IHotelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: Jacky Lee
 * @date: 2024/1/21 22:47
 */
@Slf4j
@Component
public class HotelListener {
    @Autowired
    IHotelService iHotelService;

    /**
     * @description: 监听酒店新增或修改的业务
     * @param id Hotel对象的id值
     * @return: void
     * @author: Jacky Lee
     * @date: 2024/1/21 22:46
     */
    @RabbitListener(queues = MqConstants.HOTEL_INSERT_QUEUE)
    public void listenHotelInsertOrUpdate(Long id) {
        iHotelService.insertById(id);
        log.info("Listener需要修改的id是{}", id);
    }

    /**
     * @description: 删除酒店删除业务
     * @param id Hotel对象的id
     * @return: void
     * @author: Jacky Lee
     * @date: 2024/1/21 22:52
     */
    @RabbitListener(queues = MqConstants.HOTEL_DELETE_QUEUE)
    public void listenHotelDelete(Long id) {
        iHotelService.deleteById(id);
        log.info("Listener需要删除的id是{}", id);
    }
}
