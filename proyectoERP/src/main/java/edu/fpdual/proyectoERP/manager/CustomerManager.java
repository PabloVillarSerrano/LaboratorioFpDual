package edu.fpdual.proyectoERP.manager;

import java.sql.Connection;
import java.util.List;

import edu.fpdual.proyectoERP.dao.Customer;

public interface CustomerManager {

	/**
	 * Finds all the customers in the DB
	 * 
	 * @param con DB connection
	 * @return a {@link List} of {@link Customer}
	 */
	public List<Customer> findAll(Connection con);

	/**
	 * Find an specific customer from the DB
	 * 
	 * @param con DB connection
	 * @param id  the customer id
	 * @return a {@link List} of {@link Customer}
	 */
	public Customer findById(Connection con, int id);

}
