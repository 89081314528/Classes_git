package com.company;

public class Circle {
    private final Integer radius;

    public Circle(Integer radius) {
        this.radius = radius;
    }

    public Integer getRadius() {
        return radius;
    }

    public Double perimetr () {
        return Math.PI * 2 * radius;
    }

    public Double area () {
        return Math.PI * radius * radius;
    }
}
