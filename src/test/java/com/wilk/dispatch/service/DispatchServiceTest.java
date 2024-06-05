package com.wilk.dispatch.service;

import com.wilk.dispatch.message.OrderCreated;
import com.wilk.dispatch.util.TestEventData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;



class DispatchServiceTest {

    private DispatchService service;


    @BeforeEach
    void setUp(){
        service = new DispatchService();
    }

    @Test
    void process() {
        OrderCreated testEvent = TestEventData.buildOrderCreatedEvent(UUID.randomUUID(),UUID.randomUUID().toString());
        service.process(testEvent);
    }
}