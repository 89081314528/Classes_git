package com.company;
import org.w3c.dom.ls.LSOutput;
import java.util.ArrayList;
import java.util.List;

/**1) сделать класс персон, с полями возраст и пол. у класса должен быть метод isAdult который возвращает взрослый человек или нет
 * девочки взрослые с 15, а мальчики с 35
 * поменять возраст используя метод set
 * лист с переменными класса персон
 * 2) сделать три класса - прямоугольник, треуголиник и круг. у каждого из них два метода - area, perimetеr
 */
public class Main {

    public static void main(String[] args) {
	List<Person> persons = new ArrayList<>(List.of(
	        new Person(23,"w"),
            new Person(16,"w"),
            new Person(40,"m"),
            new Person(30,"m")
    ));
        for (Person currentPerson : persons) {
            System.out.println(currentPerson.isAdult(currentPerson));
        }

        for (Person currentPerson : persons) {
            System.out.println(currentPerson.withGender("w").getGender());
        }

        Rectangle rectangle = new Rectangle(2, 3);
        Triangle triangle = new Triangle(2, 3, 4);
        Circle circle = new Circle(4);
        System.out.println(rectangle.perimetr());
        System.out.println(rectangle.area());
        System.out.println(triangle.perimetr());
        System.out.println(triangle.area());
        System.out.println(circle.perimetr());
        System.out.println(circle.area());

    }
}
