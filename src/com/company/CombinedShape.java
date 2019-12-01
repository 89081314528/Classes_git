package com.company;

import java.util.List;

public class CombinedShape implements Shape {
    private final List<Shape> shapes;

    public CombinedShape(List<Shape> shapes) {
        this.shapes = shapes;
    }


    @Override
    public Double perimetr() {
        return null;
    }

    @Override
    public Double area() {
        Double combinedArea = 0.0;
        for (Shape currentShape : shapes) {
            combinedArea = combinedArea + currentShape.area();
        }
        return combinedArea;
    }
}
