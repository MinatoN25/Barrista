package com.glo.beverages;

public class Coffee implements Beverage{
	
	private int cost;
	
	public Coffee(int cost) {
		// TODO Auto-generated constructor stub
		this.cost = cost;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.cost;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Coffee";
	}
	
}
