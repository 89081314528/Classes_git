package com.company;

public class Rectangle implements Shape {
    private final Integer length;
    private final Integer width;

    public Rectangle(Integer length, Integer width) {
        this.length = length;
        this.width = width;
    }

    public Integer getLength() {
        return length;
    }

    public Integer getWidth() {
        return width;
    }

    @Override
    public Double perimetr() {
        return (double) ((length + width) * 2);
    }

    @Override
    public Double area() {
        return (double) (length * width);
    }
}
