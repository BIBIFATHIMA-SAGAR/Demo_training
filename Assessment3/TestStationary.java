package com.thoughtfocus.jdbc.Assessment3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.h2.tools.Server;

public class TestStationary {

	public static void main(String[] args) {
		
		Connection connection = getConnection();
		
		StationaryDAO std = new StationaryDAO();
		std.createTable(connection);

		StationaryDTO dto = new StationaryDTO();
		dto.setSerialNum(1);
		dto.setBrandName("Classmate");
		dto.setName("Book");
		dto.setPrice(40);
		dto.setQuantity(100);
		dto.setType("st");
		std.add(dto, connection);
		

		StationaryDTO dto1 = new StationaryDTO();
		dto1.setSerialNum(2);
		dto1.setBrandName("Class");
		dto1.setName("Note");
		dto1.setPrice(23);
		dto1.setQuantity(200);
		dto1.setType("ts");
	
		std.add(dto1, connection);
		std.getAll(connection);
		try {
		std.deleteByserialNumber(connection, 1);
		}
		catch(SerialNumberNotFoundException e){
			e.message();
			
		}

		try {
			Server.startWebServer(connection);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	

	}
	
	private static Connection getConnection() {
		Connection con = null;

		try {
			
			con = DriverManager.getConnection("jdbc:h2:mem:ThoughtFocus","sa","sa");
			if(con!=null) {
				System.out.println("Connection acquired successfully!");
				
			}
			else {
				System.out.println("No connection established");
			}
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}

}
