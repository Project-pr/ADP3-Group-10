package za.co.cput.factory;

import za.co.cput.domain.performanceEvaluation;

import java.util.Date;

/*
performanceEvaluationFactory.java
Performance Evaluation factory class
Author: Anathi Mhlom (220006695)
Date: 22 March 2024
*/
public class performanceEvaluationFactory {
    public static performanceEvaluation createPerformanceEvaluation(int evaluationId, 
                                                                    int employeeId, 
                                                                    Date dateOfEvaluation,
                                                                    String reviewer, 
                                                                    String performanceRatings,
                                                                    String feedback, 
                                                                    String goals, 
                                                                    String objectives,
                                                                    String areasForImprovement) {
        return new performanceEvaluation.Builder()
                .evaluationId(evaluationId)
                .employeeId(employeeId)
                .dateOfEvaluation(dateOfEvaluation)
                .reviewer(reviewer)
                .performanceRatings(performanceRatings)
                .feedback(feedback)
                .goals(goals)
                .objectives(objectives)
                .areasForImprovement(areasForImprovement)
                .build();
    }
}