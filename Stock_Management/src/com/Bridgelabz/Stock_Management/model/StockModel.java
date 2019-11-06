package com.Bridgelabz.Stock_Management.model;

import java.util.List;

public class StockModel {
	
	private List<StockInfo> stockinfo;

	public List<StockInfo> getStock() {
		return stockinfo;
	}

	public void setStockInfo(List<StockInfo> stockinfo) {
		this.stockinfo = stockinfo;
	}

}
