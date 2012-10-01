// Business logic tier
package edu.uml.project90308.businesslogic;

import edu.uml.project90308.presentation.*;
import edu.uml.project90308.persistence.*;

public class StockInfo {

	public StockInfo() {
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