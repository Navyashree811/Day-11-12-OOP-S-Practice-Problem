package com.bridgelabz.oopspracticeproblem;

public class Stock {
	private String shareName;
	private int numberOfShares;
	private double sharePrice;
	double totalStockPrice;

	public Stock(String shareName, int numberOfShares, double sharePrice) {
		this.shareName = shareName;
		this.numberOfShares = numberOfShares;
		this.sharePrice = sharePrice;
		totalStockPrice = (double) numberOfShares * (double) sharePrice;
	}

	@Override
	public String toString() {
		return "Stock [stockName=" + shareName + ", numberOfShares=" + numberOfShares + ", sharePrice=" + sharePrice
				+ ", totalStockPrice=" + totalStockPrice + "]";
	}

}
