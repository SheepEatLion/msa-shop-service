package com.example.msashop.controller;

import com.example.msashop.dto.OrderDto;
import com.example.msashop.service.ShopService;
import com.example.msashop.util.ResponseForm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
public class ShopController {

    private final ShopService shopService;

    @PostMapping("/order")
    public ResponseForm order(@RequestBody OrderDto orderDto){
        log.info("order customer name: {} ", orderDto.getCName());
        return shopService.order(orderDto.getCName(), orderDto.getPName());
    }

    @PutMapping("/cancel")
    public ResponseForm cancel(@RequestBody String cName){
        log.info("order cancel name: {} ", cName);
        return shopService.cancel(cName);
    }

    @GetMapping("/order-history")
    public ResponseForm orderHistory(){
        log.info("order history all");
        return shopService.orderHistory();
    }
}
