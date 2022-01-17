package com.thoughtfocus.jdbc.Assessment3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StationaryDAO extends Stationary{
	
	
	public static String createTableQuery =
			"CREATE TABLE Stationary ("
			+"serial_num INT PRIMARY KEY,"
			+"name VARCHAR ,"
			+"brandName VARCHAR(20),"
			+"price NUMBER(8,2),"
			+"quantity NUMBER(20),"
			+"type VARCHAR(20)"
			+")";
	

	
	public static final String insertQuery=
			"INSERT INTO Stationary VALUES("
			+"?,"
			+"?,"
			+"?,"
			+"?,"
			+"?,"
			+"?)";
	
	private static final String selectAll = 
			"SELECT * FROM Stationary";
	
	public static void createTable(Connection connection) {
		PreparedStatement preparedStatement = null;
		try {
			
			preparedStatement = connection.prepareStatement(createTableQuery);
			preparedStatement.execute();
			
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	
	}
	@Override
	boolean add(StationaryDTO dtos,Connection connection) {
//		PreparedStatement preparedStatement = null;
	
		
		try(PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);) {
			
//			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
		
			preparedStatement.setInt(1, dtos.getSerialNum());
			preparedStatement.setString(2,dtos.getName());
			preparedStatement.setString(3,dtos.getBrandName());
			preparedStatement.setDouble(4, dtos.getPrice());
			preparedStatement.setDouble(5,dtos.getQuantity());
			preparedStatement.setString(6, dtos.getType());
			preparedStatement.execute();
			

		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}



	

	@Override
	StationaryDTO updatePriceByName(Connection connection,double price, String brandName) {
		 String updateQuery=
					"UPDATE from Stationary  set price=? where name=?";
		PreparedStatement preparedStatement = null;
		try {

		 
			
			preparedStatement = connection.prepareStatement(updateQuery);
			preparedStatement.setDouble(1, price);
			preparedStatement.setString(2, brandName);
			preparedStatement.execute();
			
		}catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	@Override
	void getAll(Connection connection) {
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		try {
			preparedStatement = connection.prepareStatement(selectAll);
			
			rs = preparedStatement.executeQuery();
			while(rs.next()) {
				System.out.println("SerialNum: "+rs.getInt(1));
				System.out.println("name: "+rs.getString("name"));
				System.out.println("Brand: "+rs.getString("brandName"));
				System.out.println("Quantity: "+rs.getDouble("quantity"));
				System.out.println("Price: "+rs.getDouble("price"));
			}
			

		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}
	@Override
	StationaryDTO deleteByserialNumber(Connection connection, int serialNumber) {
		PreparedStatement preparedStatement = null;
		try {

		  String deleteQuery=
					"DELETE from Stationary where serial_num="+serialNumber;
			
			preparedStatement = connection.prepareStatement(deleteQuery);
			preparedStatement.execute();
			
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		throw new SerialNumberNotFoundException();
	}
	
	

	

}
