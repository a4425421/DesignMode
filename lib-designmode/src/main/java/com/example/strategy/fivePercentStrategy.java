package com.example.strategy;

public class fivePercentStrategy implements IPriceStrategy {

	@Override
	public int setPrice(int orgPrice) {
		// TODO Auto-generated method stub
		return (int) (0.5*orgPrice);
	}

}
