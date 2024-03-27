package za.co.cput.factory;

/*
performanceEvaluationFactoryTest.java
Performance Evaluation factory test class
Author: Anathi Mhlom (220006695)
Date: 22 March 2024
*/

import org.junit.jupiter.api.Test;
import za.co.cput.domain.performanceEvaluation;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class performanceEvaluationFactoryTest {
    @Test
    public void testCreatePerformanceEvaluation() {
        performanceEvaluation evaluation = performanceEvaluationFactory.createPerformanceEvaluation(
                1,
                1001,
                new Date(),
                "John Doe",
                "Exceeds Expectations",
                "Excellent work!",
                "Increase productivity by 10%",
                "Improve communication skills",
                "Time management"
        );
        System.out.println(evaluation.toString());

        assertNotNull(evaluation);
        assertEquals(1, evaluation.getEvaluationId());
        assertEquals(1001, evaluation.getEmployeeId());
    }
}