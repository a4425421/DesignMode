package com.example.strategy;

public class sevenPercentStrategy implements IPriceStrategy{

	@Override
	public int setPrice(int orgPrice) {
		// TODO Auto-generated method stub
		return (int) (0.7*orgPrice);
	}

}
