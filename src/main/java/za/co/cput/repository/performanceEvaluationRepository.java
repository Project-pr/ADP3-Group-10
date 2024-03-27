package za.co.cput.repository;

import za.co.cput.domain.performanceEvaluation;

import java.util.HashSet;
import java.util.Set;

/*
performanceEvaluationRepository.java
performanceEvaluationRepository class
Author: Anathi Mhlom (220006695)
Date: 24 March 2024
*/
public class performanceEvaluationRepository implements IPerformanceEvaluationRepository {
    private static performanceEvaluationRepository repo = null;
    private Set<performanceEvaluation> performanceEvaluationDB = null;
    private performanceEvaluationRepository() {
        performanceEvaluationDB = new HashSet<performanceEvaluation>();
    }
    public static performanceEvaluationRepository getRepo() {
        if (repo == null) {
            repo = new performanceEvaluationRepository();
        }
        return repo;
    }
    @Override
    public performanceEvaluation create(performanceEvaluation evaluation) {
        boolean success = performanceEvaluationDB.add(evaluation);
        if (!success)
            return null;
        return evaluation;
    }

    public performanceEvaluation read(Integer integer) {
        return null;
    }

    // @Override
    public performanceEvaluation read(int performanceEvaluationId) {
        for (performanceEvaluation e : performanceEvaluationDB) {
            if (Integer.toString(performanceEvaluationId).equals(e.getEvaluationId())) {
                return e;
            }
        }
        return null;
    }

    @Override
    public performanceEvaluation update(performanceEvaluation evaluation) {
        performanceEvaluation oldPerformance = read(evaluation.getEvaluationId());
        if (oldPerformance != null) {
            performanceEvaluationDB.remove(oldPerformance);
            performanceEvaluationDB.add(evaluation);
            return evaluation;
        }
        return null;
    }

    public boolean delete(Integer integer) {
        return false;
    }

    // @Override
    public boolean delete(int performanceEvaluationId) {
        performanceEvaluation evaluationToDelete = read(performanceEvaluationId);
        if (evaluationToDelete == null)
            return false;
        performanceEvaluationDB.remove(evaluationToDelete);
        return true;
    }

    @Override
    public Set<performanceEvaluation> getAll() {
        return performanceEvaluationDB;
    }
}