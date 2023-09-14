package springboot.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.springbootbackend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}