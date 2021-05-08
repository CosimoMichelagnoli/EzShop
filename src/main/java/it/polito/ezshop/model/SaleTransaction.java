package it.polito.ezshop.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

//import it.polito.ezshop.data.TicketEntry;

public class SaleTransaction implements it.polito.ezshop.data.SaleTransaction,  Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2068771338240775445L;
	// design properties
	private HashMap<ProductType,Integer> products;
	private List<ReturnTransaction> returnTransactions;
	private BalanceOperation payment;
	private Integer TransactionId, transactionPoints;
	private String state;
	private Double amount;
	private Double paid;

	// interface properties
	private double price;
	private double discountRate;
	private List<it.polito.ezshop.data.TicketEntry> entries;
	private Integer ticketNumber;
	
	public SaleTransaction() {
		
	}

	@Override
	public Integer getTicketNumber() {
		return this.ticketNumber;
	}

	@Override
	public void setTicketNumber(Integer ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	@Override
	public List<it.polito.ezshop.data.TicketEntry> getEntries() {
		return this.entries;
	}

	@Override
	public void setEntries(List<it.polito.ezshop.data.TicketEntry> entries) {
		this.entries = entries;		
	}

	@Override
	public double getDiscountRate() {
		return this.discountRate;
	}

	@Override
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;		
	}

	public void addProduct(ProductType product, int amount) {
		this.products.put(product, this.products.get(product) + amount);
		this.amount += product.getPricePerUnit() * amount;
		// how to keep track of each product quantity here ?
	}

	public List<ReturnTransaction> getReturnTransactions() {
		return returnTransactions;
	}

	public void setReturnTransactions(List<ReturnTransaction> returnTransactions) {
		this.returnTransactions = returnTransactions;
	}

	public HashMap<ProductType, Integer> getProducts() {
		return products;
	}

	
	
	
	
	
}
