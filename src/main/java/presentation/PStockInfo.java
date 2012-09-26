// Presentation tier
package main.java.presentation;

import main.java.businesslogic.*;
import main.java.persistence.*;

public class PStockInfo {
	
	public PStockInfo() {
		return;
	}

	public String getStockSymbol() {
		return "EMC";
	}

	// display stock symbol
	public void displayStockSymbol(String [] stockInfo) {
		String[] stockInf = {"EMC", "EMC Corporation", "28.75"};
		System.out.println("Stock Symbol: " + stockInf[0]);
		System.out.println("Stock Name: " + stockInf[1]);
		System.out.println("Stock Price: " + stockInf[2]);
	}

	// display user collection
	public void displayUserStocks(String [] stocks) {
		String[] stocksX = {"EMC", "MSFT", "GOOG"};
		for (String stock : stocksX) {
			System.out.println(stock);
		}	
	}

}