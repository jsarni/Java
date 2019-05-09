package exo2;

public class Circle extends Ellipsis {

    public Circle(double X, double Y, double diameter1) {
        super(X, Y, diameter1, diameter1);
    }

    @Override
    public void display() {
        System.out.println("centre : " + getStartX() +" , " + getStartY() +"; Diametre : "+getDiameter1());

    }

    @Override
    public double perimetre() {
        return 2*getDiameter1()*PI;
    }

    @Override
    public double area() {
        return PI * getDiameter1()*getDiameter1();
    }

    @Override
    public String toString() {
        return "Circle{" +"\n" + "starX = " +getStartX()+ " starY = " + getStartY() + " diametre = " + getDiameter1() + " }";
    }
}
