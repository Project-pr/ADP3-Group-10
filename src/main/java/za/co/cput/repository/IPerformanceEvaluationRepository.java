package za.co.cput.repository;

import za.co.cput.domain.performanceEvaluation;

import java.util.Set;

/*
IPerformanceEvaluationRepository.java
IPerformanceEvaluationRepository class
Author: Anathi Mhlom (220006695)
Date: 24 March 2024
*/
public interface IPerformanceEvaluationRepository extends IRepository<performanceEvaluation, Integer>{
    public Set<performanceEvaluation> getAll();
}