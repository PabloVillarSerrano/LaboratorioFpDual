package edu.fpdual.proyectoERP.main;

import java.sql.Connection;
import java.sql.SQLException;

import edu.fpdual.proyectoERP.conector.Conector;
import edu.fpdual.proyectoERP.manager.CustomerManagerC;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Connects to the DB
		Connection con = new Conector().getMySQLConnection();
		try {
			// Looks for all the cities in the DB and prints them.
			// new CityManager().findAll(con).forEach(city ->System.out.println(city));
			System.out.println(con.getCatalog());

//			ADD CUSTOMERS
//			new CustomerManagerC().addCustomer(con,30,"Accenture", "Bravo", "Victoria");
//			DELETE CUSTOMERS
			new CustomerManagerC().deleteCustomer(con, 30);
//			CUSTOMERS COMPLETE LIST
			new CustomerManagerC().findAll(con).forEach(customer -> System.out.println(customer));

//			ADD ORDER
//			new OrderManager().addOrder(con,29,30,27,"2006-01-15 00:00:00");
//			DELETE ORDER
//			new OrderManager().deleteOrder(con, 29);
//			ORDERS COMPLETE LIST
//			new OrderManager().findAll(con).forEach(order -> System.out.println(order));

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
