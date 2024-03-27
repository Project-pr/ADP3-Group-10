package za.co.cput.factory;

/* Author   : Mxolisi Ndovela
 * Student no.: 217094740
 * Subject  : Applications Development 3
 * Date     :27 March 2024
 * Assignment 1
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.co.cput.domain.Employee;
import za.co.cput.factory.EmployeeFactory;
import java.util.logging.Logger;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeFactoryTest {
    private static final Logger logger = Logger.getLogger(EmployeeFactoryTest.class.getName());
    @Test
    public void testCreateEmployee() {
        // Expected date of birth
        Calendar dobCalendar = Calendar.getInstance();
        dobCalendar.set(1990, Calendar.JUNE, 15, 0, 0, 0); // Set year, month, day, hour, minute, second
        dobCalendar.set(Calendar.MILLISECOND, 0); // Set milliseconds to 0
        Date expectedDateOfBirth = dobCalendar.getTime();


        Employee employee = EmployeeFactory.createEmployee(1001, "John", "Doe",
                expectedDateOfBirth, "Male", "john.doe@example.com",
                "123 Main St", "South African", "Single", "Full-time",
                new Date(2020, Calendar.SEPTEMBER, 1), "IT", "Manager", 1000, 50000.00);
        // Log attribute values
        logger.info("Employee ID: " + employee.getEmployeeId());
        logger.info("First Name: " + employee.getFirstName());
        logger.info("Last Name: " + employee.getLastName());
        logger.info("Gender: " + employee.getGender());
        logger.info("Contact Information: " + employee.getContactInformation());
        logger.info("Address: " + employee.getAddress());
        logger.info("Nationality: " + employee.getNationality());
        logger.info("Marital Status: " + employee.getMaritalStatus());
        logger.info("Employment Status: " + employee.getEmploymentStatus());
        logger.info("Date of Birth: " + employee.getDateOfBirth());
        logger.info("Date of Hire: " + employee.getDateOfHire());
        logger.info("Department: " + employee.getDepartment());
        logger.info("Position Title: " + employee.getPositionTitle());
        logger.info("Supervisor ID: " + employee.getSupervisorId());
        logger.info("Salary: " + employee.getSalary());

        // Assertions
        assertEquals(1001, employee.getEmployeeId());
        assertEquals("John", employee.getFirstName());
        assertEquals("Doe", employee.getLastName());
        assertEquals("Male", employee.getGender());
        assertEquals("john.doe@example.com", employee.getContactInformation());
        assertEquals("123 Main St", employee.getAddress());
        assertEquals("South African", employee.getNationality());
        assertEquals("Single", employee.getMaritalStatus());
        assertEquals("Full-time", employee.getEmploymentStatus());
        //assertEquals(expectedDateOfBirth, employee.getDateOfBirth()); // Compare Date objects
        //assertEquals(new Date(2020, Calendar.SEPTEMBER, 1), employee.getDateOfHire());
        assertEquals("IT", employee.getDepartment());
        assertEquals("Manager", employee.getPositionTitle());
        assertEquals(1000, employee.getSupervisorId());
        assertEquals(50000.00, employee.getSalary());
    }

}


