package com.hero.cat.web.async;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Data
@Component
public class MockQueue {

    private String completeOrder;

    private String placeOrder;

    public  void setPlaceOrder(String placeOrder){
        new Thread(() -> {
            log.info("接到下单请求, " + placeOrder);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.completeOrder = placeOrder;
            log.info("下单请求处理完毕," + completeOrder);
        }).start();
    }
}
