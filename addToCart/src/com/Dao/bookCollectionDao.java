package com.Dao;

import java.util.Collection;

import com.pojo.Books;
import com.pojo.Cart;

public interface bookCollectionDao {

	Collection<Books> ViewAllBooks();

	Collection<Cart> ViewCart();

	void addBook(int id);

	void delete(int id);

	int getTotalQuantity();

	double getTotalPrice();
}