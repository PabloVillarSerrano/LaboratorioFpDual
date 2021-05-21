package edu.fpdual.proyectoERP.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Customer {

	int customerId;
	String company;
	String firstName;
	String lastName;

	public Customer() {

	}

	public Customer(ResultSet result) {
		try {
			this.customerId = result.getInt("ID");
			this.firstName = result.getString("First_Name");
			this.lastName = result.getString("Last_Name");
			this.company = result.getString("Company");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
