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
			this.orderId = result.getInt("OrderID");
			this.employeeId = result.getInt("EmployeeID");
			this.customerId = result.getInt("CustomerID");
			this.orderDate = result.getString("OrderDate");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}



