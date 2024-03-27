package za.co.cput.domain;

public class BenefitsAdministration {


    private boolean healthInsurance;
    private boolean retirementPlans;
    private boolean paidTimeOff;
    private boolean tuitionReimbursement;
    private boolean incentives;
    private boolean flexibleSpendingAccounts;
    private boolean employeeAssistancePrograms;

    private BenefitsAdministration(){}


    public boolean isHealthInsurance() {
        return healthInsurance;
    }

    public boolean isRetirementPlans() {
        return retirementPlans;
    }

    public boolean isPaidTimeOff() {
        return paidTimeOff;
    }

    public boolean isTuitionReimbursement() {
        return tuitionReimbursement;
    }

    public boolean isIncentives() {
        return incentives;
    }

    public boolean isFlexibleSpendingAccounts() {
        return flexibleSpendingAccounts;
    }

    public boolean isEmployeeAssistancePrograms() {
        return employeeAssistancePrograms;
    }

    @Override
    public String toString() {
        return "BenefitsAdministration{" +
                "healthInsurance=" + healthInsurance +
                ", retirementPlans=" + retirementPlans +
                ", paidTimeOff=" + paidTimeOff +
                ", tuitionReimbursement=" + tuitionReimbursement +
                ", incentives=" + incentives +
                ", flexibleSpendingAccounts=" + flexibleSpendingAccounts +
                ", employeeAssistancePrograms=" + employeeAssistancePrograms +
                '}';
    }

    public static class Builder{
        private final BenefitsAdministration benefits;

        public Builder() {
            benefits = new BenefitsAdministration();
        }



        public Builder retirementPlans(boolean retirementPlans) {
            benefits.retirementPlans = retirementPlans;
            return this;
        }

        public Builder healthInsurance(boolean healthInsurance ) {
            benefits.healthInsurance = healthInsurance;
            return this;
        }

        public Builder paidTimeOff(boolean paidTimeOff) {
            benefits.paidTimeOff = paidTimeOff;
            return this;
        }

        public Builder tuitionReimbursement(boolean tuitionReimbursement) {
            benefits.tuitionReimbursement = tuitionReimbursement;
            return this;
        }

        public Builder incentives(boolean incentives) {
            benefits.incentives = incentives;
            return this;
        }

        public Builder flexibleSpendingAccounts(boolean flexibleSpendingAccounts) {
            benefits.flexibleSpendingAccounts = flexibleSpendingAccounts;
            return this;
        }

        public Builder employeeAssistancePrograms(boolean employeeAssistancePrograms) {
            benefits.employeeAssistancePrograms = employeeAssistancePrograms;
            return this;
        }

        public BenefitsAdministration build() {
            return benefits;
        }
    }
}
