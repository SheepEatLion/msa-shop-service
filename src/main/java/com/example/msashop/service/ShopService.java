package com.example.msashop.service;

import com.example.msashop.config.FeignClient;
import com.example.msashop.domain.Shop;
import com.example.msashop.domain.ShopRepository;
import com.example.msashop.util.ResponseForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ShopService {

    private final ShopRepository shopRepository;
    private final FeignClient feignClient;

    public ResponseForm order(String cName, String pName){
        Shop shop = Shop.builder().customerName(cName).build();
        shopRepository.save(shop);
        String name = pName;
        return feignClient.buy(name);
        //return ResponseForm.success();
    }

    public ResponseForm cancel(String cName){
        Shop shop = shopRepository.findByCustomerName(cName);
        shop.cancel();
        return ResponseForm.success();
    }

    public ResponseForm orderHistory(){
        List<Shop> shops = shopRepository.findAll();
        return ResponseForm.successWithList(shops);
    }

}
