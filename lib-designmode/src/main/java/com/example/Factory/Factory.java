package com.example.Factory;

/**
 * Created by Administrator on 2016/4/21.
 */
public abstract class Factory {

    public final Product create(String owner){
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }


    protected  abstract  Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
