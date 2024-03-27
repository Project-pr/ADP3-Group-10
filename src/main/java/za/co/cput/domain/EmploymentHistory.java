package za.co.cput.domain;
import java.util.Date;
public class EmploymentHistory {
    private String previousPosition;
    private Date startDate;
    private Date endDate;
    private String departmentDivision;
    private String supervisorName;
    private String performanceEvaluation;
    private String terminationReason;

    // Constructor
    public EmploymentHistory(String previousPosition, Date startDate, Date endDate,
                             String departmentDivision, String supervisorName,
                             String performanceEvaluation, String terminationReason) {
        this.previousPosition = previousPosition;
        this.startDate = startDate;
        this.endDate = endDate;
        this.departmentDivision = departmentDivision;
        this.supervisorName = supervisorName;
        this.performanceEvaluation = performanceEvaluation;
        this.terminationReason = terminationReason;
    }

    // Getters and Setters
    public String getPreviousPosition() {
        return previousPosition;
    }

    public void setPreviousPosition(String previousPosition) {
        this.previousPosition = previousPosition;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDepartmentDivision() {
        return departmentDivision;
    }

    public void setDepartmentDivision(String departmentDivision) {
        this.departmentDivision = departmentDivision;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    public String getPerformanceEvaluation() {
        return performanceEvaluation;
    }

    public void setPerformanceEvaluation(String performanceEvaluation) {
        this.performanceEvaluation = performanceEvaluation;
    }

    public String getTerminationReason() {
        return terminationReason;
    }

    public void setTerminationReason(String terminationReason) {
        this.terminationReason = terminationReason;
    }

    // toString method to represent object as string
    @Override
    public String toString() {
        return "EmploymentHistory{" +
                "previousPosition='" + previousPosition + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", departmentDivision='" + departmentDivision + '\'' +
                ", supervisorName='" + supervisorName + '\'' +
                ", performanceEvaluation='" + performanceEvaluation + '\'' +
                ", terminationReason='" + terminationReason + '\'' +
                '}';
    }
}

