package com.bookService;

import java.util.Collection;

import com.pojo.Books;
import com.pojo.Cart;

public interface bookServiceInterface {
	Collection<Books> viewAllBooks();

	void addBook(int id);

	Collection<Cart> viewCart();

	void delete(int id);

	int getTotalQuantity();

	double getTotalPrice();
}
