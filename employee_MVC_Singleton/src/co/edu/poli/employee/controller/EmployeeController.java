package co.edu.poli.employee.controller;

import java.sql.SQLException;
import java.util.List;

import co.edu.poli.employee.dao.EmployeeDao;
import co.edu.poli.employee.dao.EmployeeDaoImplementation;
import co.edu.poli.employee.model.Employee;

public class EmployeeController {

	Employee e;
	EmployeeDao edao;

	public EmployeeController(String i, String n, String a) {
		e = new Employee(i, n, a);
		edao = new EmployeeDaoImplementation();
	}

	public Employee eventAdd() {
		try {
			return edao.add(e);
		} catch (SQLException e) {
			return null;
		}
	}

	public Employee eventRead(String id) {
		try {
			return edao.getEmployee(id);
		} catch (SQLException e) {
			return null;
		}
	}

	public List<Employee> eventReadAll() {
		try {
			return edao.getEmployees();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Employee eventUpdate(String id, Employee emp) {
		try {
			return edao.update(id, emp);
		} catch (SQLException e) {
			return null;
		}
	}

	public Employee eventDelete(String id) {
		try {
			return edao.delete(id);
		} catch (SQLException e) {
			return null;
		}
	}

}
