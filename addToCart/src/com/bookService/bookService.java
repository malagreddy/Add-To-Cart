package com.bookService;

import java.util.Collection;

import com.Dao.bookCollection;
import com.pojo.Books;
import com.pojo.Cart;

public class bookService implements bookServiceInterface {

	private bookCollection bookC = new bookCollection();

	@Override
	public Collection<Books> viewAllBooks() {
		return bookC.ViewAllBooks();
	}

	@Override
	public void addBook(int id) {
		bookC.addBook(id);
	}

	@Override
	public Collection<Cart> viewCart() {
		return bookC.ViewCart();
	}

	@Override
	public void delete(int id) {
		bookC.delete(id);
	}

	@Override
	public int getTotalQuantity() {
		return bookC.getTotalQuantity();
	}

	@Override
	public double getTotalPrice() {
		return bookC.getTotalPrice();
	}

}
