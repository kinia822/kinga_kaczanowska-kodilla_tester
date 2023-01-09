package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private String stampDimensions;
    private String isStamped;

    public Stamp(String stampName, String stampDimensions, String isStamped) {
        this.stampName = stampName;
        this.stampDimensions = stampDimensions;
        this.isStamped = isStamped;
    }

    public String getStampName() {
        return stampName;
    }

    public String getStampDimensions() {
        return stampDimensions;
    }

    public String getIsStamped() {
        return isStamped;
    }

    @Override
    public String
    toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampDimensions='" + stampDimensions + '\'' +
                ", isStamped='" + isStamped + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Objects.equals(stampName, stamp.stampName) && Objects.equals(stampDimensions, stamp.stampDimensions) && Objects.equals(isStamped, stamp.isStamped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampDimensions, isStamped);
    }
}
