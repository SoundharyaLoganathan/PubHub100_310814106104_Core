package com.bookapp.dao;

import java.sql.SQLException;

import com.bookapp.model.User;

public class TestUserDAO {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		User user = new User();
		user.setUserName("padma");
		user.setEmail("padma@gmail.com");
		user.setPassword("p123");
		user.setActive(1);
		
		
		UserDAO dao= new UserDAO();
		dao.register(user);
		
		
	}

}
