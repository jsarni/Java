package exo2;

import java.util.Objects;

public class Ellipsis extends Geometry2D {
     private double diameter1;
     private double diameter2;

    public Ellipsis(double X, double Y, double diameter1, double diameter2) {
        super(X, Y);
        this.diameter1 = diameter1;
        this.diameter2 = diameter2;
    }

    public double getDiameter1() {
        return diameter1;
    }

    public void setDiameter1(double diameter1) {
        this.diameter1 = diameter1;
    }

    public double getDiameter2() {
        return diameter2;
    }

    public void setDiameter2(double diameter2) {
        this.diameter2 = diameter2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ellipsis ellipsis = (Ellipsis) o;
        return Double.compare(ellipsis.diameter1, diameter1) == 0 &&
                Double.compare(ellipsis.diameter2, diameter2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), diameter1, diameter2);
    }

    @Override
    public String toString() {
        return super.toString()+"Ellipsis{" +
                "diameter1=" + diameter1 +
                ", diameter2=" + diameter2 +
                '}';
    }

    @Override
    public void display() {
        super.display();
        System.out.println("diametre 1 : "+diameter1+"diametre 2: "+diameter2);
    }

    @Override
    public double area() {
        return PI * diameter2 * diameter1;

    }

    @Override
    public double perimetre() {
        return PI * 12;
    }
}
