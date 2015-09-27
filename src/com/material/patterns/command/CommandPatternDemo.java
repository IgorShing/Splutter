package com.material.patterns.command;

import com.material.logic.Demo;

public class CommandPatternDemo implements Demo {

	private static final String	NAME	= "Command pattern";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {
		Stock abcStock = new Stock();

		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);

		Broker broker = new Broker();

		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();
	}

}
