package co.edu.poli.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.poli.employee.model.Employee;

public class EmployeeDaoImplementation implements EmployeeDao {

	static Connection con = DatabaseConnection.getConnection();

	@Override
	public Employee add(Employee emp) throws SQLException {
		String query = "insert into employee(emp_id, emp_name, emp_address) VALUES (?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, emp.getEmp_id());
		ps.setString(2, emp.getEmp_name());
		ps.setString(3, emp.getEmp_address());
		ps.executeUpdate();
		return emp;
	}

	@Override
	public Employee delete(String id) throws SQLException {
		Employee e = getEmployee(id);
		if (e != null) {
			String query = "delete from employee where emp_id =?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, id);
			ps.executeUpdate();
		}
		return e;
	}

	@Override
	public Employee getEmployee(String id) throws SQLException {
		String query = "select * from employee where emp_id= ?";
		PreparedStatement ps = con.prepareStatement(query);
		Employee emp = null;
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();
		boolean check = false;
		while (rs.next()) {
			check = true;
			emp = new Employee(
					rs.getString("emp_id"),
					rs.getString("emp_name"), 
					rs.getString("emp_address"));
		}

		if (check)
			return emp;
		else
			return null;
	}

	@Override
	public List<Employee> getEmployees() throws SQLException {
		String query = "select * from employee";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		List<Employee> ls = new ArrayList<Employee>();

		while (rs.next()) {
			Employee emp = new Employee(
					rs.getString("emp_id"),
					rs.getString("emp_name"), 
					rs.getString("emp_address"));
			ls.add(emp);
		}
		return ls;
	}

	@Override
	public Employee update(String id, Employee emp) throws SQLException {

		Employee e = getEmployee(id);
		if (e != null) {

			String query = "update employee set emp_name=?, " + " emp_address= ? where emp_id = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, emp.getEmp_name());
			ps.setString(2, emp.getEmp_address());
			ps.setString(3, emp.getEmp_id());
			ps.executeUpdate();
		}

		return e;
	}
}
