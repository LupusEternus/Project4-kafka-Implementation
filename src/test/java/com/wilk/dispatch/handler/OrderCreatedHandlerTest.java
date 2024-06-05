package com.wilk.dispatch.handler;

import com.wilk.dispatch.message.OrderCreated;
import com.wilk.dispatch.service.DispatchService;
import com.wilk.dispatch.util.TestEventData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class OrderCreatedHandlerTest {

    private OrderCreatedHandler handler;
    private DispatchService dispatchServiceMock;


    @BeforeEach
    void setUp(){
        dispatchServiceMock = mock(DispatchService.class);
        handler = new OrderCreatedHandler(dispatchServiceMock);
    }

    @Test
    void listen() {
        OrderCreated testEvent = TestEventData.buildOrderCreatedEvent(UUID.randomUUID(),UUID.randomUUID().toString());
        handler.listen(testEvent);
        verify(dispatchServiceMock,times(1)).process(testEvent);
    }
}