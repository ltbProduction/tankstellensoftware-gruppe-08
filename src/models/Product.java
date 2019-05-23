package models;

import java.text.DecimalFormat;

public abstract class Product {

	protected int number;
	protected String name;
	protected double amount;
	protected String unit;
	protected double purchasePrice;
	protected double salePrice;
	protected double totalPurchasePrice;
	protected double totalSalePrice; 
	
	
	
	// Methoden
	
	public Product(int number, String name, String unit, double amount, double purchasePrice, double salePrice) {
		this.number = number;
		this.name = name;
		this.amount = amount;
		this.unit = unit;
		this.purchasePrice = purchasePrice;
		this.salePrice = salePrice;
		totalPurchasePrice = amount*purchasePrice;
		totalSalePrice = amount*salePrice;
		
	}
	
	public abstract void createorder(int amount);
	public abstract void displayorder();
	public abstract void createdelivery(int amount);
	
//	public void displayProduct() {
//	    //Das passende Format f�r die Ausgabe
//	    DecimalFormat df = new DecimalFormat("#.00");
//		System.out.println("Product: " + number + ", " + name + ", " + unit  + ", " + df.format(salePrice)  + ", " + df.format(amount));
//	}
	
	public abstract int getNumber();
	
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double price) {
		this.salePrice = price;
	}
	
	
	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public double getTotalPurchasePrice() {
		return totalPurchasePrice;
	}

	public void setTotalPurchasePrice(double totalPurchasePrice) {
		this.totalPurchasePrice = totalPurchasePrice;
	}

	public double getTotalSalePrice() {
		return totalSalePrice;
	}

	public void setTotalSalePrice(double totalSalePrice) {
		this.totalSalePrice = totalSalePrice;
	}

	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String displayreceipt() {
		String text;
		text = name + " - " + String.valueOf(amount) + " "+ unit + " - "+ String.valueOf(salePrice) + " EUR/"+unit+" - "+ String.valueOf(amount*salePrice) +" EUR"; 
		return text;
	}
	
	
	
	



}
