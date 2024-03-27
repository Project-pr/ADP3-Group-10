package za.co.cput.payroll;

/* Author   : Likhaya Kalimashe
 * Student no.: 240329171
 * Subject  : Applications Development 3
 * Date     :27 March 2024
 * Assignment 1
 *
 */

import java.util.*;

public class PayrollInfo {
    // Define the Employee class representing an employee entity
    static class Employee {
        private final int employeeId;
        private final String firstName;
        private final String lastName;
        private final double salary;

        // Private constructor for Employee class
        private Employee(Builder builder) {
            this.employeeId = builder.employeeId;
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.salary = builder.salary;
        }

        // Getters for Employee properties
        public int getEmployeeId() {
            return employeeId;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getSalary() {
            return salary;
        }

        // Builder class for Employee
        static class Builder {
            private int employeeId;
            private String firstName;
            private String lastName;
            private double salary;

            public Builder setEmployeeId(int employeeId) {
                this.employeeId = employeeId;
                return this;
            }

            public Builder setFirstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            public Builder setLastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            public Builder setSalary(double salary) {
                this.salary = salary;
                return this;
            }

            public Employee build() {
                return new Employee(this);
            }
        }
    }

    // Define the PayrollRepository interface to handle CRUD operations for employees
    interface PayrollRepository {
        void create(Employee employee);
        Employee read(int id);
        void update(Employee employee);
        void delete(int id);
        List<Employee> getAll();
    }

    // Define the in-memory implementation of the PayrollRepository interface
    static class InMemoryPayrollRepositoryImpl implements PayrollRepository {
        private final Map<Integer, Employee> employeeMap;
        private static InMemoryPayrollRepositoryImpl instance;

        // Private constructor to ensure singleton pattern
        private InMemoryPayrollRepositoryImpl() {
            employeeMap = new HashMap<>();
        }

        // Method to get the singleton instance of the repository
        public static synchronized InMemoryPayrollRepositoryImpl getInstance() {
            if (instance == null) {
                instance = new InMemoryPayrollRepositoryImpl();
            }
            return instance;
        }

        @Override
        public void create(Employee employee) {
            Employee put = employeeMap.put(employee.getEmployeeId(), employee);
        }

        @Override
        public Employee read(int id) {
            return employeeMap.get(id);
        }

        @Override
        public void update(Employee employee) {
            employeeMap.put(employee.getEmployeeId(), employee);
        }

        @Override
        public void delete(int id) {
            employeeMap.remove(id);
        }

        @Override
        public List<Employee> getAll() {
            return new ArrayList<>(employeeMap.values());
        }
    }

    // Main class for running the payroll system
    public class PayrollInformation {
        public static void main(String[] args) {
            // Instantiate repository
            PayrollRepository repository = InMemoryPayrollRepositoryImpl.getInstance();

            // Create a scanner object to read user input
            Scanner scanner = new Scanner(System.in);

            // Prompt user for employee information
            System.out.println("Enter employee ID:");
            int employeeId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("Enter first name:");
            String firstName = scanner.nextLine();
            System.out.println("Enter last name:");
            String lastName = scanner.nextLine();
            System.out.println("Enter salary:");
            double salary = scanner.nextDouble();

            // Create employee object with user input
            Employee employee = new Employee.Builder()
                    .setEmployeeId(employeeId)
                    .setFirstName(firstName)
                    .setLastName(lastName)
                    .setSalary(salary)
                    .build();

            // Add employee information to repository
            repository.create(employee);

            // Retrieve employee information from repository
            Employee retrievedEmployee = repository.read(employeeId);

            // Display employee information
            if (retrievedEmployee != null) {
                System.out.println("Employee ID: " + retrievedEmployee.getEmployeeId());
                System.out.println("First Name: " + retrievedEmployee.getFirstName());
                System.out.println("Last Name: " + retrievedEmployee.getLastName());
                System.out.println("Salary: " + retrievedEmployee.getSalary());
            } else {
                System.out.println("Employee information not found.");
            }

            // Close scanner
            scanner.close();
        }
    }
}
