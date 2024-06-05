package com.wilk.dispatch.message;


import lombok.*;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderCreated {

    UUID orderId;
    String item;

}
