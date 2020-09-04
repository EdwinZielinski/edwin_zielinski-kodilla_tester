package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamps {
    private String stampName;
    private double sizeStamps;
    private String stamped;

    public Stamps(String stampName, double sizeStamps, String stamped){
        this.stampName = stampName;
        this.sizeStamps = sizeStamps;
        this. stamped = stamped;
    }
    public String getStampName(){
        return stampName;
    }
    public double getSizeStamps(){
        return sizeStamps;
    }
    public String getStamped(){
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamps stamps = (Stamps) o;
        return Double.compare(stamps.sizeStamps, sizeStamps) == 0 &&
                Objects.equals(stampName, stamps.stampName) &&
                Objects.equals(stamped, stamps.stamped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, sizeStamps, stamped);
    }

    @Override
    public String toString() {
        return "Stamps{" +
                "stampName='" + stampName + '\'' +
                ", sizeStamps=" + sizeStamps +
                ", stamped='" + stamped + '\'' +
                '}';
    }
}
