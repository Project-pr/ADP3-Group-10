package za.co.cput.repository;

import za.co.cput.domain.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeRepository implements EmployeeRepositoryImpl {
    private static final Map<Integer, Employee> employeeMap = new HashMap<>();
    private static final EmployeeRepository INSTANCE = new EmployeeRepository();

    private EmployeeRepository() {}

    public static EmployeeRepository getInstance() {
        return INSTANCE;
    }

    @Override
    public void create(Employee employee) {
        employeeMap.put(employee.getEmployeeId(), employee);
    }

    @Override
    public Employee read(int employeeId) {
        return employeeMap.get(employeeId);
    }

    @Override
    public void update(Employee employee) {
        if (employeeMap.containsKey(employee.getEmployeeId())) {
            employeeMap.put(employee.getEmployeeId(), employee);
        } else {
            throw new IllegalArgumentException("Employee not found with ID: " + employee.getEmployeeId());
        }
    }

    @Override
    public void delete(int employeeId) {
        employeeMap.remove(employeeId);
    }

    @Override
    public List<Employee> getAll() {
        return new ArrayList<>(employeeMap.values());
    }
}
