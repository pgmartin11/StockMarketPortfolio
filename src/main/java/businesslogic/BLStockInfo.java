// Business logic tier
package main.java.businesslogic;

import main.java.presentation.*;
import main.java.persistence.*;

public class BLStockInfo {

	public BLStockInfo() {
		return;
	}

	public Stock searchStock(String stockName) {
		return new Stock();
	} 

	public boolean addStockSymbol(Person person, Stock stockInfo) {
		return true;
	}

	public boolean removeStockSymbol(Stock stockInfo) {
		return true;
	}

	public Stock editStockInfo(Stock stockInfo) {
		return new Stock();
	}

	public Stock selectStockSymbol(String stockName) {
 		return new Stock();
 	}
 
	public boolean refreshQuote(String stockName) {
		return true;
	} 
	
}