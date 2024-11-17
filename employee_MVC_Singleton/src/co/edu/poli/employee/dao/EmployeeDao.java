package co.edu.poli.employee.dao;

import java.sql.SQLException;
import java.util.List;

import co.edu.poli.employee.model.Employee;
  
public interface EmployeeDao {
  
    public Employee add(Employee emp)
        throws SQLException;
    
    public Employee delete(String id)
        throws SQLException;
    
    public Employee getEmployee(String id)
        throws SQLException;
    
    public List<Employee> getEmployees()
        throws SQLException;
    
    public Employee update(String id, Employee emp)
        throws SQLException;
    

}