package edu.fpdual.proyectoERP.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString

public class Order {
	
	int orderId;
	int employeeId;
	int customerId; 
	String orderDate;
	
	public Order() {

	}

	public Order(ResultSet result) {
		try {
			this.orderId = result.getInt("Order_ID");
			this.employeeId = result.getInt("Employee_ID");
			this.customerId = result.getInt("Customer_ID");
			this.orderDate = result.getString("Order_Date");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}



