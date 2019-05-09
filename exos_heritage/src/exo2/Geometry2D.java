package exo2;

import java.util.Objects;

public abstract class Geometry2D implements Geometry,Comparable {

    private double startX;
    private double startY;

    public double getStartX() {
        return startX;
    }

    public void setStartX(double startX) {
        this.startX = startX;
    }

    public double getStartY() {
        return startY;
    }

    public void setStartY(double startY) {
        this.startY = startY;
    }

    public Geometry2D(double X, double Y){
        startX = X;
        startY = Y;
    }

    public void display(){
        System.out.println(startX+','+startY);
    }

    @Override
    public double area() {
        return 0.0;
    }

    public int compareTo(Geometry2D ob){
        if (this.area() < ob.area()){
            return -1;
        } else if (this.area() > ob.area()){
            return 1;
        } else {
            return 0;
        }
    }

    public abstract double perimetre();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Geometry2D that = (Geometry2D) o;
        return Double.compare(that.startX, startX) == 0 &&
                Double.compare(that.startY, startY) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(startX, startY);
    }

    @Override
    public String toString() {
        return "Geometry2D{" +
                "startX=" + startX +
                ", startY=" + startY +
                '}';
    }


}
