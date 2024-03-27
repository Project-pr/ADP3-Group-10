package za.co.cput.factory;

import org.testng.annotations.Test;
import za.co.cput.domain.EmploymentHistory;

import java.util.Date;

import static org.junit.Assert.*;

public class EmploymentHistoryFactoryTest {

    @Test
    public void testCreateEmploymentHistory() {
        // Create employment history using the factory
        String previousPosition = "Software Engineer";
        Date startDate = new Date(121, 0, 1); // Year is 2021, month is January (0-based index), day is 1
        Date endDate = new Date(123, 11, 31); // Year is 2023, month is December (0-based index), day is 31
        String departmentDivision = "Engineering";
        String supervisorName = "John Doe";
        String performanceEvaluation = "Exceeded Expectations";
        String terminationReason = "Found better opportunity";

        EmploymentHistory employmentHistory = EmploymentHistoryFactory.createEmploymentHistory(previousPosition, startDate, endDate,
                departmentDivision, supervisorName,
                performanceEvaluation, terminationReason);

        // Verify employment history
        assertNotNull(employmentHistory);
        assertEquals(previousPosition, employmentHistory.getPreviousPosition());
        assertEquals(startDate, employmentHistory.getStartDate());
        assertEquals(endDate, employmentHistory.getEndDate());
        assertEquals(departmentDivision, employmentHistory.getDepartmentDivision());
        assertEquals(supervisorName, employmentHistory.getSupervisorName());
        assertEquals(performanceEvaluation, employmentHistory.getPerformanceEvaluation());
        assertEquals(terminationReason, employmentHistory.getTerminationReason());
    }
}
