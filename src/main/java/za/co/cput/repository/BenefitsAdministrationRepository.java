package za.co.cput.repository;

/*Masithembe Ndzotyana
  BenefitsAdminstration
  219145091
 */



import za.co.cput.domain.BenefitsAdministration;

import java.util.HashMap;
import java.util.Map;

public class BenefitsAdministrationRepository implements IBenefitsAdministrationRepository {

    private static final Map<Integer, BenefitsAdministration> benefitsMap = new HashMap<>();
    private static final BenefitsAdministrationRepository INSTANCE = new BenefitsAdministrationRepository();

    private BenefitsAdministrationRepository() {
    }

    public static BenefitsAdministrationRepository getInstance() {
        return INSTANCE;
    }

    public void create(int id, BenefitsAdministration benefitsAdministration) {
        benefitsMap.put(id, benefitsAdministration);
    }

    public BenefitsAdministration read(int id) {
        return benefitsMap.get(id);
    }

    public void update(int id, BenefitsAdministration benefitsAdministration) {
        if (benefitsMap.containsKey(id)) {
            benefitsMap.put(id, benefitsAdministration);
        } else {
            throw new IllegalArgumentException("BenefitsAdministration not found with ID: " + id);
        }
    }

    public void delete(int id) {
        benefitsMap.remove(id);
    }

    public Map<Integer, BenefitsAdministration> getAll() {
        return new HashMap<>(benefitsMap);
    }
}

