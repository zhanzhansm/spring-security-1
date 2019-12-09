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
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.completeOrder = placeOrder;
        }).start();
    }
}
