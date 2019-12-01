package com.company;

public class Triangle implements Shape {
    private final Integer sideA;
    private final Integer sideB;
    private final Integer sideC;

    public Triangle(Integer sideA, Integer sideB, Integer sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Integer getSideA() {
        return sideA;
    }

    public Integer getSideB() {
        return sideB;
    }

    public Integer getSideC() {
        return sideC;
    }

    @Override
    public Double perimetr() {
        return Double.valueOf(sideA + sideB + sideC);
    }

    @Override
    public Double area() {
        return Double.valueOf((sideA * sideB) / 2);
    }
}
