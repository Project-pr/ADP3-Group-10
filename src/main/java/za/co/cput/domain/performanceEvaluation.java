package za.co.cput.domain;

/*
performanceEvaluation.java
Performance Evaluation model class
Author: Anathi Mhlom (220006695)
Date: 22 March 2024
*/

import java.util.Date;

public class performanceEvaluation {
    private int evaluationId;
    private int employeeId;
    private Date dateOfEvaluation;
    private String reviewer;
    private String performanceRatings;
    private String feedback;
    private String goals;
    private String objectives;
    private String areasForImprovement;

    // Private constructor
    private performanceEvaluation(Builder builder) {
        this.evaluationId = builder.evaluationId;
        this.employeeId = builder.employeeId;
        this.dateOfEvaluation = builder.dateOfEvaluation;
        this.reviewer = builder.reviewer;
        this.performanceRatings = builder.performanceRatings;
        this.feedback = builder.feedback;
        this.goals = builder.goals;
        this.objectives = builder.objectives;
        this.areasForImprovement = builder.areasForImprovement;
    }

    // Getter methods
    public int getEvaluationId() {
        return evaluationId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public Date getDateOfEvaluation() {
        return dateOfEvaluation;
    }

    public String getReviewer() {
        return reviewer;
    }

    public String getPerformanceRatings() {
        return performanceRatings;
    }

    public String getFeedback() {
        return feedback;
    }

    public String getGoals() {
        return goals;
    }

    public String getObjectives() {
        return objectives;
    }

    public String getAreasForImprovement() {
        return areasForImprovement;
    }

    // Builder class
    public static class Builder {
        private int evaluationId;
        private int employeeId;
        private Date dateOfEvaluation;
        private String reviewer;
        private String performanceRatings;
        private String feedback;
        private String goals;
        private String objectives;
        private String areasForImprovement;

        public Builder evaluationId(int evaluationId) {
            this.evaluationId = evaluationId;
            return this;
        }

        public Builder employeeId(int employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder dateOfEvaluation(Date dateOfEvaluation) {
            this.dateOfEvaluation = dateOfEvaluation;
            return this;
        }

        public Builder reviewer(String reviewer) {
            this.reviewer = reviewer;
            return this;
        }

        public Builder performanceRatings(String performanceRatings) {
            this.performanceRatings = performanceRatings;
            return this;
        }

        public Builder feedback(String feedback) {
            this.feedback = feedback;
            return this;
        }

        public Builder goals(String goals) {
            this.goals = goals;
            return this;
        }

        public Builder objectives(String objectives) {
            this.objectives = objectives;
            return this;
        }

        public Builder areasForImprovement(String areasForImprovement) {
            this.areasForImprovement = areasForImprovement;
            return this;
        }

        // Builder method
        public performanceEvaluation build() {
            return new performanceEvaluation(this);
        }

        // toString method
        @Override
        public String toString() {
            return "Builder{" +
                    "evaluationId=" + evaluationId +
                    ", employeeId=" + employeeId +
                    ", dateOfEvaluation=" + dateOfEvaluation +
                    ", reviewer='" + reviewer + '\'' +
                    ", performanceRatings='" + performanceRatings + '\'' +
                    ", feedback='" + feedback + '\'' +
                    ", goals='" + goals + '\'' +
                    ", objectives='" + objectives + '\'' +
                    ", areasForImprovement='" + areasForImprovement + '\'' +
                    '}';
        }
    }
}