package com.example.msashop.util;

import com.example.msashop.domain.Shop;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Builder
public class ResponseForm <T>{

    private Integer code;
    private String msg;
    private T data;

    public static ResponseForm success(){
        return ResponseForm.builder().code(200).msg("success").data(null).build();
    }

    public static ResponseForm fail(Integer code, String msg){
        return ResponseForm.builder().code(code).msg(msg).data(null).build();
    }

    public static ResponseForm successWithList(List<Shop> data){
        return ResponseForm.builder().code(200).msg("success").data(data).build();
    }

    public static ResponseForm successWithSingle(Shop data){
        return ResponseForm.builder().code(200).msg("success").data(data).build();
    }
}
