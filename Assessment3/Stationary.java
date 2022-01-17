package com.thoughtfocus.jdbc.Assessment3;

import java.sql.Connection;

public abstract class Stationary {
	abstract boolean add(StationaryDTO dtos,Connection connection);
	abstract void getAll(Connection connection);
	abstract StationaryDTO deleteByserialNumber(Connection connection,int serialNumber);
	
	abstract StationaryDTO updatePriceByName(Connection connection,double price, String brandName);
	

}
