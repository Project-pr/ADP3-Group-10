package za.co.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.co.cput.domain.Employee;
import za.co.cput.repository.EmployeeRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeRepositoryTest {
    private EmployeeRepository employeeRepository;

    @BeforeEach
    public void setUp() {
        employeeRepository = EmployeeRepository.getInstance();
    }

    @Test
    public void testCRUDOperations() {
        // Create
        Employee employee = new Employee.Builder()
                .setEmployeeId(1001)
                .setFirstName("John")
                .setLastName("Doe")
                .setPositionTitle("Manager")
                .setContactInformation("john.doe@example.com")
                .setDepartment("IT")
                .build();
        employeeRepository.create(employee);

        // Read
        Employee retrievedEmployee = employeeRepository.read(1001);
        assertNotNull(retrievedEmployee);
        assertEquals("John", retrievedEmployee.getFirstName());
        assertEquals("Doe", retrievedEmployee.getLastName());
        assertEquals("Manager", retrievedEmployee.getPositionTitle());
        assertEquals("john.doe@example.com", retrievedEmployee.getContactInformation());
        assertEquals("IT", retrievedEmployee.getDepartment());

        // Update
        retrievedEmployee.setFirstName("Jane");
        retrievedEmployee.setLastName("Smith");
        employeeRepository.update(retrievedEmployee);
        assertEquals("John", employeeRepository.read(1001).getFirstName());
        assertEquals("Doe", employeeRepository.read(1001).getLastName());

        // Delete
        employeeRepository.delete(1001);
        assertNull(employeeRepository.read(1001));
    }

    @Test
    public void testGetAll() {
        // Assuming there are already employees in the repository
        Employee employee1 = new Employee.Builder()
                .setEmployeeId(1001)
                .setFirstName("John")
                .setLastName("Doe")
                .setPositionTitle("Manager")
                .setContactInformation("john.doe@example.com")
                .setDepartment("IT")
                .build();
        employeeRepository.create(employee1);

        Employee employee2 = new Employee.Builder()
                .setEmployeeId(1002)
                .setFirstName("Jane")
                .setLastName("Smith")
                .setPositionTitle("Developer")
                .setContactInformation("jane.smith@example.com")
                .setDepartment("IT")
                .build();
        employeeRepository.create(employee2);

        List<Employee> employees = employeeRepository.getAll();
        assertNotNull(employees);
        assertEquals(2, employees.size());
    }
}
