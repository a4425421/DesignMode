package com.example.Factory;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by Administrator on 2016/4/21.
 */
public class IDCard extends Product {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm");
    Date date = new Date();
    private String owner;

    public IDCard(String owner){
        this.owner = owner;
        date.setTime(System.currentTimeMillis());

    }

    @Override
    public String create() {
        System.out.println("craete" + owner + "infomation card");

        return "craete -["+owner +"]- infomation car";
    }

    @Override
    public String use() {

        System.out.println("["+owner+"]" +" in  ["+format.format(date) +"] -logging");
        return owner +"in "+format.format(date) +" -logging" ;
    }
}
