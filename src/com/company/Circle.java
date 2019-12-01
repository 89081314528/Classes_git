package com.company;

public class Circle implements Shape {
    private final Integer radius;

    public Circle(Integer radius) {
        this.radius = radius;
    }

    public Integer getRadius() {
        return radius;
    }

    @Override
    public Double perimetr() {
        return Math.PI * 2 * radius;
    }

    @Override
    public Double area() {
        return Math.PI * radius * radius;
    }
}
