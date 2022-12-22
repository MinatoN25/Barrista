package com.glo.beverages;

public class Cream extends BeverageDecorator{
	
	private int cost;
	private Beverage beverage;
	
	public Cream(Beverage beverage, int cost) {
		// TODO Auto-generated constructor stub
		this.cost = cost;
		this.beverage=beverage;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.cost+this.beverage.getCost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription() + " topped with cream";
	}
	
}