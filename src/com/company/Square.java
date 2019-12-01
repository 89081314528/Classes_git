package com.company;
// implements реализует
public class Square implements Shape {
    private final Integer side;

    public Square(Integer side) {
        this.side = side;
    }

    public Integer getSide() {
        return side;
    }
    @Override
    // эта метка означает, что один метод, который идет после метки, реализует/переопределяет метод из интерфейса
    //Override мы пишем, чтобы понимать, что метод, который за ним следует, не из квадрата, а из интерфейса
    // Без Override код тоже будет работать
    public Double perimetr() {
        return (double) (side * 4);
    }
    @Override
    public Double area() { return (double) (side * side); }
}
