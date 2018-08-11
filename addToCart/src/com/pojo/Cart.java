package com.pojo;

public class Cart {

	int quantity;
	Books book;

	public Cart(int quantity, Books book) {
		super();
		this.quantity = quantity;
		this.book = book;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Books getBook() {
		return book;
	}

	public void setBook(Books book) {
		this.book = book;
	}

}
