package za.co.cput.factory;

/* Author   : Mxolisi Ndovela
 * Student no.: 217094740
 * Subject  : Applications Development 3
 * Date     :27 March 2024
 * Assignment 1
 */

import za.co.cput.domain.Employee;

import java.util.Date;

public class EmployeeFactory {
    public static Employee createEmployee(int employeeId, String firstName, String lastName,
                                          Date dateOfBirth, String gender, String contactInformation,
                                          String address, String nationality, String maritalStatus,
                                          String employmentStatus, Date dateOfHire, String department,
                                          String positionTitle, int supervisorId, double salary) {
        return new Employee.Builder()
                .setEmployeeId(employeeId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setDateOfBirth(String.valueOf(dateOfBirth))
                .setGender(gender)
                .setContactInformation(contactInformation)
                .setAddress(address)
                .setNationality(nationality)
                .setMaritalStatus(maritalStatus)
                .setEmploymentStatus(employmentStatus)
                .setDateOfHire(String.valueOf(dateOfHire))
                .setDepartment(department)
                .setPositionTitle(positionTitle)
                .setSupervisorId(supervisorId)
                .setSalary(salary)
                .build();
    }
}
