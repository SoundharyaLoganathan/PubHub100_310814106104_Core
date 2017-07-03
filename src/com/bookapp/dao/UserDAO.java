package com.bookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookapp.model.User;
import com.bookapp.util.ConnectionUtil;

public class UserDAO {
	public void register(User user) throws ClassNotFoundException, SQLException {

		Connection connection = ConnectionUtil.getConnection();

		PreparedStatement pst = connection
				.prepareStatement("INSERT INTO users (user_name,email,PASSWORD,active) VALUES (?,?,?,?)");

		pst.setString(1, user.getUserName());
		pst.setString(2, user.getEmail());
		pst.setString(3, user.getPassword());
		pst.setInt(4, user.getActive());

		pst.executeUpdate();

	}

	public boolean login(User user) throws ClassNotFoundException, SQLException{
		
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pst = connection
				.prepareStatement("SELECT user_name FROM users WHERE email=? AND PASSWORD=?");
		
		pst.setString(1, user.getEmail());
		pst.setString(2, user.getPassword());
		
		ResultSet rs=pst.executeQuery();
		
		boolean flag=false;
		
		if (rs.next()){
			flag=true;
			
		}
		return flag;
	}

}
