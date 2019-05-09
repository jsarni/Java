package exo2;

import java.sql.SQLOutput;
import java.util.Objects;

public class Rectangle extends Geometry2D{
    private double length;
    private double height;

    public Rectangle(double X, double Y, double length, double height) {
        super(X, Y);
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }



    @Override
    public void display() {
        super.display();
        System.out.println("longeur : "+length+"; largeur : "+height);
    }

    @Override
    public double area() {

        return length * height;
    }

    @Override
    public double perimetre() {
        return 2 * length + 2 * height;
    }

    @Override
    public int compareTo(Geometry2D ob) {
        return super.compareTo(ob);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.length, length) == 0 &&
                Double.compare(rectangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length, height);
    }

    @Override
    public String toString() {
        return super.toString() + "Rectangle{" +
                "length=" + length +
                ", height=" + height +
                '}';
    }
}
