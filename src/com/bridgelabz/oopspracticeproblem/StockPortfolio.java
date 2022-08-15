/*
 * Q.1 : Stock Account Management
 */
package com.bridgelabz.oopspracticeproblem;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Stock> stocks = new ArrayList<>();

	public static void main(String[] args) {

		StockPortfolio stockPF = new StockPortfolio();
		stockPF.stockCalculator();
	}

	public void stockCalculator() {
		double totalStockValue = 0;
		System.out.println("Enter how many companies Stocks do you want to buy : ");
		int company = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < company; i++) {
			System.out.println("Enter the detail for comapany " + (i + 1));
			System.out.println("Enter the Name of the Share : ");
			String shareName = scanner.nextLine();
			System.out.println("Enter how many share you want to buy for " + shareName + " company : ");
			int numberOfShare = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter the price of " + shareName + " share : ");
			double priceOfShare = scanner.nextDouble();
			scanner.nextLine();
			double priceOfStock = (double) numberOfShare * (double) priceOfShare;
			stocks.add(new Stock(shareName, numberOfShare, priceOfShare));
			totalStockValue += priceOfStock;
		}
		System.out.println(stocks);
		System.out.println("Your total value of all the stocks is : " + totalStockValue + "Rs");
	}

}
