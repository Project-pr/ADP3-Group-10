package za.co.cput.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.co.cput.domain.BenefitsAdministration;
import za.co.cput.repository.BenefitsAdministrationRepository;

public class BenefitsAdministrationRepositoryTest {
    private BenefitsAdministrationRepository benefitsRepository;

    public BenefitsAdministrationRepositoryTest() {
    }

    @BeforeEach
    public void setUp() {
        this.benefitsRepository = BenefitsAdministrationRepository.getInstance();
    }

    @Test
    public void testCRUDOperations() {
        BenefitsAdministration benefits = new BenefitsAdministration.Builder()
                .healthInsurance(true)
                .retirementPlans(true)
                .paidTimeOff(true)
                .tuitionReimbursement(true)
                .incentives(true)
                .flexibleSpendingAccounts(true)
                .employeeAssistancePrograms(true)
                .build();

        this.benefitsRepository.create(1, benefits);
        BenefitsAdministration retrievedBenefits = this.benefitsRepository.read(1);

        Assertions.assertNotNull(retrievedBenefits);
        Assertions.assertTrue(retrievedBenefits.isHealthInsurance());
        Assertions.assertTrue(retrievedBenefits.isRetirementPlans());
        Assertions.assertTrue(retrievedBenefits.isPaidTimeOff());
        Assertions.assertTrue(retrievedBenefits.isTuitionReimbursement());
        Assertions.assertTrue(retrievedBenefits.isIncentives());
        Assertions.assertTrue(retrievedBenefits.isFlexibleSpendingAccounts());
        Assertions.assertTrue(retrievedBenefits.isEmployeeAssistancePrograms());

        retrievedBenefits.isHealthInsurance();
        this.benefitsRepository.update(1, retrievedBenefits);
        Assertions.assertEquals(true, this.benefitsRepository.read(1).isHealthInsurance());

        this.benefitsRepository.delete(1);
        Assertions.assertNull(this.benefitsRepository.read(1));
    }

    @Test
    public void testGetAll() {
        BenefitsAdministration benefits1 = new BenefitsAdministration.Builder()
                .healthInsurance(true)
                .retirementPlans(true)
                .build();

        BenefitsAdministration benefits2 = new BenefitsAdministration.Builder()
                .healthInsurance(false)
                .retirementPlans(false)
                .build();

        this.benefitsRepository.create(1, benefits1);
        this.benefitsRepository.create(2, benefits2);

        Assertions.assertEquals(2, this.benefitsRepository.getAll().size());
    }
}

