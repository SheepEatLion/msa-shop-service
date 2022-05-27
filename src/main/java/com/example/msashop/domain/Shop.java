package com.example.msashop.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Shop extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String customerName;

    @Column(nullable = false)
    private String orderYn;

    /**
     * 비지니스 로직
     */

    @Builder
    public Shop(String customerName){
        this.customerName = customerName;
        this.orderYn = "ORDER";
    }

    public void cancel(){
        this.orderYn = "CANCEL";
    }

}
