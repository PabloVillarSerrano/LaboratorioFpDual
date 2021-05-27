package edu.fpdual.proyectoERP.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fpdual.proyectoERP.dao.Order;

public class OrderManager {
	public List<Order> findAll(Connection con) {
		try (Statement stmt = con.createStatement()) {
			ResultSet result = stmt.executeQuery("SELECT * FROM Orders ORDER BY OrderID");
			result.beforeFirst();

			List<Order> order = new ArrayList<>();

			while (result.next()) {
				order.add(new Order(result));
			}
			return order;
		} catch (SQLException e) {

			e.printStackTrace();
			return Collections.emptyList();
		}
	}

	public List<Order> findAll2(Connection con) {

		try (Statement stmt = con.createStatement()) {
			ResultSet result = stmt.executeQuery("SELECT OrderID,EmployeeID,CustomerID,OrderDate FROM Orders;");
			result.beforeFirst();

			List<Order> order = new ArrayList<>();

			while (result.next()) {
				order.add(new Order(result));
			}

			return order;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	

	public List<Order> findByEmployeeId(Connection con, int idEmpleado) {
		try {
			PreparedStatement stmt = con.prepareStatement(
					"SELECT * FROM Orders JOIN Employees ON Employees.ID=Orders.EmployeeID WHERE Employees.ID=? ORDER BY OrderDate DESC");
			stmt.setInt(1, idEmpleado);
			ResultSet result = stmt.executeQuery();

			result.beforeFirst();

			List<Order> order = new ArrayList<>();

			while (result.next()) {
				order.add(new Order(result));
			}
			return order;
		} catch (SQLException e) {

			e.printStackTrace();
			return Collections.emptyList();
		}
	}

	public List<Order> findByCustomerId(Connection con, int idCustomer) {
		try {
			PreparedStatement stmt = con.prepareStatement(
					"SELECT * FROM Orders JOIN Customers ON Customers.ID=Orders.CustomerID WHERE Customers.ID=? ORDER BY OrderDate DESC");
			stmt.setInt(1, idCustomer);
			ResultSet result = stmt.executeQuery();

			result.beforeFirst();

			List<Order> order = new ArrayList<>();

			while (result.next()) {
				order.add(new Order(result));
			}
			return order;
		} catch (SQLException e) {

			e.printStackTrace();
			return Collections.emptyList();
		}
	}

	public void addOrder(Connection con, int orderId, int employeeId, int customerId, String orderDate) {
		try (PreparedStatement prepStmt = con.prepareStatement(
				"INSERT INTO Orders (OrderID, EmployeeID, CustomerID, OrderDate) VALUES ( ?, ?, ?,?)")) {
			con.setAutoCommit(false);
			prepStmt.setInt(1, orderId);
			prepStmt.setInt(2, employeeId);
			prepStmt.setInt(3, customerId);
			prepStmt.setString(4, orderDate);
			prepStmt.executeUpdate();
			System.out.println("Se ha guardado un nuevo pedido: ");

			con.commit();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void deleteOrder(Connection con, int orderId) {
		try (PreparedStatement prepStmt = con.prepareStatement("DELETE FROM Orders WHERE OrderID = ?")) {
			con.setAutoCommit(false);
			prepStmt.setInt(1, orderId);
			prepStmt.executeUpdate();
			System.out.println("Se ha borrado el pedido");
			con.commit();

		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

	public void updateOrder(Connection con, Order order) throws SQLException {

		PreparedStatement prepStmt = con
				.prepareStatement("UPDATE Orders SET EmployeeID=?, CustomerID = ? , OrderDate= ? WHERE ID = ?");
		prepStmt.setInt(1, order.getEmployeeId());
		prepStmt.setInt(2, order.getCustomerId());
		prepStmt.setString(3, order.getOrderDate());
		prepStmt.setInt(4, order.getOrderId());

		prepStmt.executeUpdate();

		prepStmt.close();
	}
}