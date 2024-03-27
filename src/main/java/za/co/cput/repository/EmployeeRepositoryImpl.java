package za.co.cput.repository;

/* Author   : Mxolisi Ndovela
 * Student no.: 217094740
 * Subject  : Applications Development 3
 * Date     :27 March 2024
 * Assignment 1
 */

import za.co.cput.domain.Employee;

import java.util.List;

public interface EmployeeRepositoryImpl {
    void create(Employee employee);
    Employee read(int employeeId);
    void update(Employee employee);
    void delete(int employeeId);
    List<Employee> getAll();
}
