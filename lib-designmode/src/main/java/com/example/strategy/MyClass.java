package com.example.strategy;

import com.example.strategy.DstPrice;
import com.example.strategy.IPriceStrategy;
import com.example.strategy.fivePercentStrategy;

public class MyClass {

    public static void main(String[] args){
          /*
            策略模式
         */
        DstPrice dstPrice =  new DstPrice();
        dstPrice.setPriceStrategy(new fivePercentStrategy());  //使用五折策略
        dstPrice.setPriceStrategy(new IPriceStrategy() {       //或者自己实现一个计价
            @Override
            public int setPrice(int orgPrice) {
                return 5*orgPrice;
            }
        });
        System.out.print( dstPrice.calculatePrice(50));
    }
}
