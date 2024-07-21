package com.test.pet.annotation;

public enum TesterName {
    SUMIT("Sumit Dhiman");

    public String authorName;
    TesterName(String authorName)
    {
        this.authorName=authorName;
    }

    public String toString() {
        return this.authorName;
    }
}
