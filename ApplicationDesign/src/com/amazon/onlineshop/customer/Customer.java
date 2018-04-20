package com.amazon.onlineshop.customer;

/**
 * Customer Information in this class.
 * @author amit
 * @version 1.0
 * @since April 2018
 * 
 */
/*
 * 
 */
public class Customer {
	private int id;
	private String name;
	private double balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
//	public void setId(int id){
//		if(id>0){
//		this.id = id;
//		}
//		else{
//			System.out.println("Invalid Id ");
//		}
//	}
//	public int getId(){
//		return id;
//	}
}
