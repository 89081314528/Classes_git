package com.company;

public class Rectangle {
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

    public Integer perimetr() {
        return (length + width) * 2;
    }

    public Integer area() {
        return length * width;
    }
}
