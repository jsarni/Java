package exo2.shapes.shapes2D;

import exo2.Geometry;

public class Circle extends Ellipsis {

    private String name;

    public Circle(String name,double X, double Y, double diameter1) {
        super(X, Y, diameter1, diameter1);
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("centre : " + getStartX() +" , " + getStartY() +"; Diametre : "+getDiameter1());

    }

    @Override
    public double perimetre() {
        return 2*getDiameter1()* Geometry.PI;
    }

    @Override
    public double area() {
        return Geometry.PI * getDiameter1()*getDiameter1();
    }

    @Override
    public String toString() {
        return "Circle{" +"\n" + "starX = " +getStartX()+ " starY = " + getStartY() + " diametre = " + getDiameter1() + " }";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
