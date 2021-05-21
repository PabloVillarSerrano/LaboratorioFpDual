package edu.fpdual.proyectoERP.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import edu.fpdual.proyectoERP.conector.Conector;
import edu.fpdual.proyectoERP.dao.Customer;
import edu.fpdual.proyectoERP.manager.CustomerManager;
import edu.fpdual.proyectoERP.manager.impl.CustomerManagerImpl;

public class CustomerController {
	private CustomerManager customersManager;

	public CustomerController(CustomerManagerImpl customersManagerImpl) {
		this.customersManager = customersManagerImpl;
	}

	public List<Customer> getAllCustomers() throws ClassNotFoundException, SQLException {
		try (Connection con = new Conector().getMySQLConnection()) {
			return customersManager.findAll(con);
		}
	}
}
