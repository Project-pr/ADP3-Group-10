
package za.co.cput.domain;

/* Author   : Mxolisi Ndovela
 * Student no.: 217094740
 * Subject  : Applications Development 3
 * Date     :27 March 2024
 * Assignment 1
 */

public class Employee {

    private final int employeeId;
    private final String firstName;
    private final String lastName;
    private final String dateOfBirth;
    private final String gender;
    private final String contactInformation;
    private final String address;
    private final String nationality;
    private final String maritalStatus;
    private final String employmentStatus;
    private final String dateOfHire;
    private final String department;
    private final String positionTitle;
    private final int supervisorId;
    private final double salary;

    private Employee(int employeeId, Builder builder) {
        this.employeeId = employeeId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.dateOfBirth = builder.dateOfBirth;
        this.gender = builder.gender;
        this.contactInformation = builder.contactInformation;
        this.address = builder.address;
        this.nationality = builder.nationality;
        this.maritalStatus = builder.maritalStatus;
        this.employmentStatus = builder.employmentStatus;
        this.dateOfHire = builder.dateOfHire;
        this.department = builder.department;
        this.positionTitle = builder.positionTitle;
        this.supervisorId = builder.supervisorId;
        this.salary = builder.salary;
    }

    // Getters for all attributes

    public int getEmployeeId() {
        return employeeId;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public String getAddress() {
        return address;
    }

    public String getNationality() {
        return nationality;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public String getDateOfHire() {
        return dateOfHire;
    }

    public String getDepartment() {
        return department;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public int getSupervisorId() {
        return supervisorId;
    }

    public double getSalary() {
        return salary;
    }

    public void setFirstName(String jane) {
    }

    public void setLastName(String smith) {
    }

    // Builder class
    public static class Builder {

        private int employeeId;
        private String firstName;
        private String lastName;
        private String dateOfBirth;
        private String gender;
        private String contactInformation;
        private String address;
        private String nationality;
        private String maritalStatus;
        private String employmentStatus;
        private String dateOfHire;
        private String department;
        private String positionTitle;
        private int supervisorId;
        private double salary;

        // Setters for all attributes

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

        public Builder setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setContactInformation(String contactInformation) {
            this.contactInformation = contactInformation;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Builder setMaritalStatus(String maritalStatus) {
            this.maritalStatus = maritalStatus;
            return this;
        }

        public Builder setEmploymentStatus(String employmentStatus) {
            this.employmentStatus = employmentStatus;
            return this;
        }

        public Builder setDateOfHire(String dateOfHire) {
            this.dateOfHire = dateOfHire;
            return this;
        }

        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Builder setPositionTitle(String positionTitle) {
            this.positionTitle = positionTitle;
            return this;
        }

        public Builder setSupervisorId(int supervisorId) {
            this.supervisorId = supervisorId;
            return this;
        }

        public Builder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        // Build method
        public Employee build() {
            return new Employee(employeeId, this);
        }
    }

    // toString() method
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", contactInformation='" + contactInformation + '\'' +
                ", address='" + address + '\'' +
                ", nationality='" + nationality + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", employmentStatus='" + employmentStatus + '\'' +
                ", dateOfHire='" + dateOfHire + '\'' +
                ", department='" + department + '\'' +
                ", positionTitle='" + positionTitle + '\'' +
                ", supervisorId=" + supervisorId +
                ", salary=" + salary +
                '}';
    }
}
