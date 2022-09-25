package com.ab.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "receipt")
public class Receipt {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "receipt_code")
	private String receiptCode;

	@Column(name = "date_created")
	private String dateCreated;

	@Column(name = "total_cost")
	private double totalPriceWithServiceCharge;

	@Column(name = "order_quantity")
	private int orderQuantity;

	public Receipt() {
	}

	public Receipt(int id, String receiptCode, String dateCreated, double totalPriceWithServiceCharge,
			int orderQuantity) {
		this.id = id;
		this.receiptCode = receiptCode;
		this.dateCreated = dateCreated;
		this.totalPriceWithServiceCharge = totalPriceWithServiceCharge;
		this.orderQuantity = orderQuantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReceiptCode() {
		return receiptCode;
	}

	public void setReceiptCode(String receiptCode) {
		this.receiptCode = receiptCode;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public double getTotalPriceWithServiceCharge() {
		return totalPriceWithServiceCharge;
	}

	public void setTotalPriceWithServiceCharge(double totalPriceWithServiceCharge) {
		this.totalPriceWithServiceCharge = totalPriceWithServiceCharge;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	@Override
	public String toString() {
		return "Receipt [id=" + id + ", receiptCode=" + receiptCode + ", dateCreated=" + dateCreated
				+ ", totalPriceWithServiceCharge=" + totalPriceWithServiceCharge + ", orderQuantity=" + orderQuantity
				+ "]";
	}

} // end of class
