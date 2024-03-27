package za.co.cput.repository;

import za.co.cput.domain.EmploymentHistory;

import java.util.ArrayList;
import java.util.List;

public class EmploymentHistoryRepository {
    private List<EmploymentHistory> employmentHistories;

    public EmploymentHistoryRepository() {
        this.employmentHistories = new ArrayList<>();
    }

    public void addEmploymentHistory(EmploymentHistory employmentHistory) {
        employmentHistories.add(employmentHistory);
    }

    public void removeEmploymentHistory(EmploymentHistory employmentHistory) {
        employmentHistories.remove(employmentHistory);
    }

    public List<EmploymentHistory> getAllEmploymentHistories() {
        return employmentHistories;
    }

    public EmploymentHistory getEmploymentHistory(int index) {
        if (index >= 0 && index < employmentHistories.size()) {
            return employmentHistories.get(index);
        }
        return null;
    }

    public EmploymentHistory getEmploymentHistoryByPosition(String position) {
        for (EmploymentHistory employmentHistory : employmentHistories) {
            if (employmentHistory.getPreviousPosition().equalsIgnoreCase(position)) {
                return employmentHistory;
            }
        }
        return null;
    }

    public List<EmploymentHistory> getEmploymentHistoriesBySupervisorName(String supervisorName) {
        List<EmploymentHistory> result = new ArrayList<>();
        for (EmploymentHistory employmentHistory : employmentHistories) {
            if (employmentHistory.getSupervisorName().equalsIgnoreCase(supervisorName)) {
                result.add(employmentHistory);
            }
        }
        return result;
    }
}




