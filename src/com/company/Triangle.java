package com.company;

public class Triangle {
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

    public Integer perimetr () {
        return sideA + sideB + sideC;
    }

    public Integer area () {
        return (sideA * sideB) / 2;
    }
}
