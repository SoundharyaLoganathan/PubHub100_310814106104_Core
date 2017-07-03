package com.bookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bookapp.model.Book;
import com.bookapp.util.ConnectionUtil;

public class BookDAO {

	public void addBook(Book book) throws SQLException, ClassNotFoundException {

		Connection connection = ConnectionUtil.getConnection();

		PreparedStatement pst = connection.prepareStatement("INSERT INTO books(book_name,author,price)VALUES(?,?,?)");

		pst.setString(1, book.getBookName());
		pst.setString(2, book.getAuthor());
		pst.setInt(3, book.getPrice());

		pst.executeUpdate();
	}

	public void update(Book book1) throws ClassNotFoundException, SQLException {

		Connection connection = ConnectionUtil.getConnection();

		PreparedStatement pst = connection.prepareStatement("UPDATE books SET price=? WHERE id=?");

		pst.setInt(1, book1.getPrice());
		pst.setInt(2, book1.getId());

		pst.executeUpdate();

	}

	public void delete(Book book) throws ClassNotFoundException, SQLException {

		Connection connection = ConnectionUtil.getConnection();

		PreparedStatement pst = connection.prepareStatement("DELETE FROM books WHERE id=? and book_name=?");
		pst.setInt(1, book.getId());
		pst.setString(2, book.getBookName());

		pst.executeUpdate();

	}

	public List<Book> listAll() throws ClassNotFoundException, SQLException {

		Connection connection = ConnectionUtil.getConnection();

		PreparedStatement pst = connection.prepareStatement("SELECT id,book_name,author,price FROM books");

		ResultSet rs = pst.executeQuery();
		List<Book> books = new ArrayList<>();

		while (rs.next()) {

			Book book = new Book();
			book.setId(rs.getInt(1));
			book.setBookName(rs.getString(2));
			book.setAuthor(rs.getString(3));
			book.setPrice(rs.getInt(4));
			books.add(book);
		}

		return books;
	}

	public List<Book> findByName(Book book) throws ClassNotFoundException, SQLException {

		Connection connection = ConnectionUtil.getConnection();

		PreparedStatement pst = connection
				.prepareStatement("SELECT id,book_name,author,price FROM books WHERE book_name=?");

		pst.setString(1, book.getBookName());

		ResultSet rs = pst.executeQuery();
		List<Book> books = new ArrayList<>();

		while (rs.next()) {

			Book book1 = new Book();
			book1.setId(rs.getInt(1));
			book1.setBookName(rs.getString(2));
			book1.setAuthor(rs.getString(3));
			book1.setPrice(rs.getInt(4));
			books.add(book1);
		}
		System.out.println(books.size());
		return books;
	}

}
