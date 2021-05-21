package edu.fpdual.proyectoERP.manager.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fpdual.proyectoERP.dao.Customer;
import edu.fpdual.proyectoERP.manager.CustomerManager;

public class CustomerManagerImpl implements CustomerManager {

	/**
	 * Finds all the cities in the DB
	 * 
	 * @param con DB connection
	 * @return a {@link List} of {@link City}
	 */
	public List<Customer> findAll(Connection con) {

		try (Statement stmt = con.createStatement()) {
			ResultSet result = stmt.executeQuery("SELECT * FROM Customers");
			result.beforeFirst();

			List<Customer> cities = new ArrayList<>();

			while (result.next()) {
				cities.add(new Customer(result));
			}
			return cities;
		} catch (SQLException e) {

			e.printStackTrace();
			return Collections.emptyList();
		}
	}

	

	@Override
	public Customer findById(Connection con, int id) {

		return null;
	}
}
