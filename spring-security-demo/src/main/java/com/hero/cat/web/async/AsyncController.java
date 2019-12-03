package com.hero.cat.web.async;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

@RestController
@RequestMapping("async")
@Slf4j
public class AsyncController {

    @Autowired
    private DeferredResultHolder deferredResultHolder;
    @Autowired
    private MockQueue mockQueue;

    @RequestMapping("order")
    public DeferredResult<String> order() throws Exception{
        log.info("主线程开始");

        String orderNumber = RandomStringUtils.randomNumeric(8);
        mockQueue.setPlaceOrder(orderNumber); //交给异步线程处理

        DeferredResult<String> deferredResult = new DeferredResult<String>();
        deferredResultHolder.getMap().put(orderNumber,deferredResult);

        log.info("主线程结束");
        return deferredResult;


    }

}
