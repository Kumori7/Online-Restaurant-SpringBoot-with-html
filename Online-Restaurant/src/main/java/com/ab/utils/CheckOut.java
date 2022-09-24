package com.ab.utils;

public class CheckOut {

	private double totalPrice;

	private int totalCartSize;

	public CheckOut() {
	}

	public CheckOut(double totalPrice, int totalCartSize) {
		this.totalPrice = totalPrice;
		this.totalCartSize = totalCartSize;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getTotalCartSize() {
		return totalCartSize;
	}

	public void setTotalCartSize(int totalCartSize) {
		this.totalCartSize = totalCartSize;
	}

	@Override
	public String toString() {
		return "CheckOut [totalPrice=" + totalPrice + ", totalCartSize=" + totalCartSize + "]";
	}

} // end of class
