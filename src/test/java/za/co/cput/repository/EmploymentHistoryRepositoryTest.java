package za.co.cput.repository;

import org.junit.Test;
import za.co.cput.domain.EmploymentHistory;
import java.util.Date;
import static org.junit.Assert.*;

public class EmploymentHistoryRepositoryTest {

    @Test
    public void testAddAndGetEmploymentHistory() {
        EmploymentHistoryRepository repository = new EmploymentHistoryRepository();

        // Create employment history
        String previousPosition = "Software Engineer";
        Date startDate = new Date(121, 0, 1); // Year is 2021, month is January (0-based index), day is 1
        Date endDate = new Date(123, 11, 31); // Year is 2023, month is December (0-based index), day is 31
        String departmentDivision = "Engineering";
        String supervisorName = "John Doe";
        String performanceEvaluation = "Exceeded Expectations";
        String terminationReason = "Found better opportunity";

        EmploymentHistory employmentHistory = new EmploymentHistory(previousPosition, startDate, endDate,
                departmentDivision, supervisorName,
                performanceEvaluation, terminationReason);

        // Add employment history to repository
        repository.addEmploymentHistory(employmentHistory);

        // Retrieve employment history from repository
        EmploymentHistory retrievedEmploymentHistory = repository.getEmploymentHistory(0);

        // Verify retrieved employment history
        assertNotNull(retrievedEmploymentHistory);
        assertEquals(previousPosition, retrievedEmploymentHistory.getPreviousPosition());
        assertEquals(startDate, retrievedEmploymentHistory.getStartDate());
        assertEquals(endDate, retrievedEmploymentHistory.getEndDate());
        assertEquals(departmentDivision, retrievedEmploymentHistory.getDepartmentDivision());
        assertEquals(supervisorName, retrievedEmploymentHistory.getSupervisorName());
        assertEquals(performanceEvaluation, retrievedEmploymentHistory.getPerformanceEvaluation());
        assertEquals(terminationReason, retrievedEmploymentHistory.getTerminationReason());
    }

    @Test
    public void testRemoveEmploymentHistory() {
        EmploymentHistoryRepository repository = new EmploymentHistoryRepository();

        // Create employment history
        String previousPosition = "Data Analyst";
        Date startDate = new Date(120, 6, 1); // Year is 2020, month is July (0-based index), day is 1
        Date endDate = new Date(121, 5, 30); // Year is 2021, month is June (0-based index), day is 30
        String departmentDivision = "Analytics";
        String supervisorName = "Emily Johnson";
        String performanceEvaluation = "Met Expectations";
        String terminationReason = null; // No termination reason provided

        EmploymentHistory employmentHistory = new EmploymentHistory(previousPosition, startDate, endDate,
                departmentDivision, supervisorName,
                performanceEvaluation, terminationReason);

        // Add employment history to repository
        repository.addEmploymentHistory(employmentHistory);

        // Remove employment history from repository
        repository.removeEmploymentHistory(employmentHistory);

        // Attempt to retrieve the removed employment history
        EmploymentHistory removedEmploymentHistory = repository.getEmploymentHistory(0);

        // Verify that removed employment history is null
        assertNull(removedEmploymentHistory);
    }

    @Test
    public void testGetEmploymentHistoryByPosition() {
        EmploymentHistoryRepository repository = new EmploymentHistoryRepository();

        // Create employment histories
        EmploymentHistory history1 = new EmploymentHistory("Software Engineer", new Date(), new Date(), "Engineering", "John Doe", "Good", null);
        EmploymentHistory history2 = new EmploymentHistory("Data Analyst", new Date(), new Date(), "Analytics", "Jane Smith", "Excellent", null);
        EmploymentHistory history3 = new EmploymentHistory("Project Manager", new Date(), new Date(), "Management", "Mark Johnson", "Satisfactory", null);

        // Add employment histories to repository
        repository.addEmploymentHistory(history1);
        repository.addEmploymentHistory(history2);
        repository.addEmploymentHistory(history3);

        // Retrieve employment history by position
        EmploymentHistory retrievedHistory = repository.getEmploymentHistoryByPosition("Data Analyst");

        // Verify retrieved employment history
        assertNotNull(retrievedHistory);
        assertEquals("Data Analyst", retrievedHistory.getPreviousPosition());
    }

    @Test
    public void testGetEmploymentHistoriesBySupervisorName() {
        EmploymentHistoryRepository repository = new EmploymentHistoryRepository();

        // Create employment histories
        EmploymentHistory history1 = new EmploymentHistory("Software Engineer", new Date(), new Date(), "Engineering", "John Doe", "Good", null);
        EmploymentHistory history2 = new EmploymentHistory("Data Analyst", new Date(), new Date(), "Analytics", "Jane Smith", "Excellent", null);
        EmploymentHistory history3 = new EmploymentHistory("Project Manager", new Date(), new Date(), "Management", "John Doe", "Satisfactory", null);

        // Add employment histories to repository
        repository.addEmploymentHistory(history1);
        repository.addEmploymentHistory(history2);
        repository.addEmploymentHistory(history3);

        // Retrieve employment histories by supervisor name
        String supervisorName = "John Doe";
        java.util.List<EmploymentHistory> retrievedHistories = repository.getEmploymentHistoriesBySupervisorName(supervisorName);

        // Verify retrieved employment histories
        assertNotNull(retrievedHistories);
        assertEquals(2, retrievedHistories.size());
        for (EmploymentHistory history : retrievedHistories) {
            assertEquals(supervisorName, history.getSupervisorName());
        }
    }
}
