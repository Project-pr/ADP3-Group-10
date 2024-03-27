package za.co.cput.factory;
import za.co.cput.domain.EmploymentHistory;

import java.util.Date;

public class EmploymentHistoryFactory {
    public static EmploymentHistory createEmploymentHistory(String previousPosition, Date startDate, Date endDate,
                                                            String departmentDivision, String supervisorName,
                                                            String performanceEvaluation, String terminationReason) {
        return new EmploymentHistory(previousPosition, startDate, endDate, departmentDivision,
                supervisorName, performanceEvaluation, terminationReason);
    }
}
