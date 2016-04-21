package com.example.Factory;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/4/21.
 */
public class IDCardFactory  extends Factory{


    private ArrayList<Product>  owners = new ArrayList<Product>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(product);
    }


    public ArrayList<Product> getOwners(){
        return owners;
    }
}
