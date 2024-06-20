package mx.ubuntu.employee.employeeapi.respository;

import mx.ubuntu.employee.employeeapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}