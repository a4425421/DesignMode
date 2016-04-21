package com.example.strategy;

public class DstPrice {
	
	/*
	 * 策略模式
	 */
	
	private IPriceStrategy priceStrategy;
	
	public void setPriceStrategy(IPriceStrategy priceStrategy){
		this.priceStrategy = priceStrategy;
	}
	
	public int calculatePrice(int price){
		return priceStrategy.setPrice(price);
	}
}
