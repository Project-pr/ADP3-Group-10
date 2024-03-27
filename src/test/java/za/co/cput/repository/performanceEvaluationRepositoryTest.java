package za.co.cput.repository;

/*
performanceEvaluationRepositoryTest.java
Performance Evaluation repository test class
Author: Anathi Mhlom (220006695)
Date: 24 March 2024
*/

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.co.cput.domain.performanceEvaluation;
import za.co.cput.factory.performanceEvaluationFactory;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class performanceEvaluationRepositoryTest {

    private static performanceEvaluationRepository repo = performanceEvaluationRepository.getRepo();
    private static performanceEvaluation evaluation = performanceEvaluationFactory.createPerformanceEvaluation(
            2,
            1002,
            new Date(),
            "Alice Smith",
            "Meets Expectations",
            "Good work!",
            "Increase productivity by 25%",
            "Improve technical skills",
            "Goal setting");

    @Test
    void a_create() {
        performanceEvaluation created = repo.create(evaluation);
        assertEquals(evaluation.getEvaluationId(), created.getEvaluationId());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read() {
        performanceEvaluation read = repo.read(evaluation.getEvaluationId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        performanceEvaluation.Builder builder = new performanceEvaluation.Builder();

        performanceEvaluation updated = builder
                .evaluationId(3)
                .employeeId(1003)
                .dateOfEvaluation(new Date())
                .reviewer("Jane Doe")
                .performanceRatings("Meet Expectations")
                .feedback("Okay work")
                .goals("Increase productivity by 30%")
                .objectives("Improve presentation skills")
                .areasForImprovement("Talking speed")
                .build();

        assertNotNull(repo.update(updated));
        System.out.println("Updated: " + updated);
    }


    @Test
    void e_delete() {
        boolean success = repo.delete(evaluation.getEvaluationId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(repo);
    }
}