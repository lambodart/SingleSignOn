package com.example.snapwork.StudentApp.Bean;
public class CoverPositionRequestSchema {
    private String positionName;
    private int positionId;
    private double coverageAmount;

    // Default constructor
    public CoverPositionRequestSchema() {}

    // Parameterized constructor (optional)
    public CoverPositionRequestSchema(String positionName, int positionId, double coverageAmount) {
        this.positionName = positionName;
        this.positionId = positionId;
        this.coverageAmount = coverageAmount;
    }

    // Getters and Setters
    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public double getCoverageAmount() {
        return coverageAmount;
    }

    public void setCoverageAmount(double coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    @Override
    public String toString() {
        return "CoverPositionRequestSchema{" +
                "positionName='" + positionName + '\'' +
                ", positionId=" + positionId +
                ", coverageAmount=" + coverageAmount +
                '}';
    }
}
