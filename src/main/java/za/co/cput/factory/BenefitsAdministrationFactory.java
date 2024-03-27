package za.co.cput.factory;

import za.co.cput.domain.BenefitsAdministration;

public class BenefitsAdministrationFactory {

    public static BenefitsAdministration createBenefitsAdministration(
            boolean healthInsurance,
            boolean retirementPlans,
            boolean paidTimeOff,
            boolean tuitionReimbursement,
            boolean incentives,
            boolean flexibleSpendingAccounts,
            boolean employeeAssistancePrograms) {


        return new BenefitsAdministration.Builder()
                .healthInsurance(healthInsurance)
                .retirementPlans(retirementPlans)
                .paidTimeOff(paidTimeOff)
                .tuitionReimbursement(tuitionReimbursement)
                .incentives(incentives)
                .flexibleSpendingAccounts(flexibleSpendingAccounts)
                .employeeAssistancePrograms(employeeAssistancePrograms)
                .build();
    }
}
