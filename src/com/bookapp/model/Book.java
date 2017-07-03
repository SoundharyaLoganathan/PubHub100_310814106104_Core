package com.bookapp.model;

public class Book {
private int id;
private String bookName;
private String author;
private int price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [id=" + id + ", bookName=" + bookName + ", author=" + author + ", price=" + price + "]";
}



}
