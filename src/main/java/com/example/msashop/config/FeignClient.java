package com.example.msashop.config;

import com.example.msashop.util.ResponseForm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.cloud.openfeign.FeignClient(name = "product-service")
public interface FeignClient {

    @GetMapping("/buy")
    ResponseForm buy(@RequestParam("name") String name);
}
