package com.example.Factory;

import com.example.strategy.DstPrice;
import com.example.strategy.IPriceStrategy;
import com.example.strategy.fivePercentStrategy;

public class MyClass {

    public static void main(String[] args){
          /*
            工厂模式
         */

        Factory factory = new IDCardFactory();
        Product card1 = factory.create(" small light");
        Product card2 = factory.create(" small red ");
        card1.create();
        card1.use();
        card2.create();
        card2.use();
    }
}
