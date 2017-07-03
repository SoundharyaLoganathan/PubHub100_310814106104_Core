package com.bookapp.dao;

import java.sql.SQLException;

import com.bookapp.model.Book;

public class TestBookDAO {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Book book = new Book();
		Book book1 = new Book();
		Book book2 = new Book();
		
		book.setBookName("alchemist");
		book.setAuthor("paulo coehlo");
		book.setPrice(455);
		
		//book1.setId(2);
		//book1.setPrice(666);
 
		//book2.setId(2);
		//book2.setBookName("half girl friend");
		
		BookDAO dao = new BookDAO();

		dao.addBook(book);
		//dao.update(book1);
		//dao.delete(book2);
		
		
		book2.setBookName("3 mistakes");
		dao.findByName(book2);

	}

}
