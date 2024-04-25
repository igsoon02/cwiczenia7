import java.util.List;
import java.util.ArrayList;

interface Figure {
    double getPerimeter();
    double getArea();
    String getType();
}

class Circle implements Figure {
    private double promien;

    public Circle(double promien) {
        this.promien = promien;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * promien;
    }

    @Override
    public double getArea() {
        return Math.PI * promien * promien;
    }

    @Override
    public String getType() {
        return "Circle";
    }
}

class Parallelogram implements Figure {
    private double podstawa;
    private double bok;
    private double wysokosc;

    public Parallelogram(double podstawa, double bok, double wysokosc) {
        this.podstawa = podstawa;
        this.bok = bok;
        this.wysokosc = wysokosc;
    }

    @Override
    public double getPerimeter() {
        return 2 * (podstawa + bok);
    }

    @Override
    public double getArea() {
        return podstawa * wysokosc;
    }

    @Override
    public String getType() {
        return "Parallelogram";
    }
}

class Rectangle implements Figure {
    private double bokA;
    private double bokB;

    public Rectangle(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    public double getPerimeter() {
        return 2 * (bokA + bokB);
    }

    @Override
    public double getArea() {
        return bokA * bokB;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }
}

public class Main {

    public static void main(String[] args) {
        double radius = 3d;
        Figure circle = new Circle(radius);

        double baseSide = 10d;
        double side = 5d;
        double height = 8d;
        Figure parallelogram = new Parallelogram(baseSide, side, height);

        double sideA = 15d;
        double sideB = 10d;
        Figure rectangle = new Rectangle(sideA, sideB);

        List<Figure> figures = new ArrayList<>(3);
        figures.add(circle);
        figures.add(parallelogram);
        figures.add(rectangle);

        for (Figure figure : figures) {
            System.out.println(figure.getType());
            System.out.println("Area: " + figure.getArea() + " units.");
            System.out.println("Perimeter: " + figure.getPerimeter() + " units.\n");
        }
    }
}
