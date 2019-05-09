package exo2.shapes.shapes3D;

import exo2.Geometry;

import java.util.Objects;

public abstract class Geometry3D implements Geometry,Comparable {

    private double startX;
    private double startY;
    private double startZ;

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

    public double getStartZ() {
        return startZ;
    }

    public void setStartZ(double startZ) {
        this.startZ = startZ;
    }

    public Geometry3D(double startX, double startY, double startZ) {
        this.startX = startX;
        this.startY = startY;
        this.startZ = startZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Geometry3D that = (Geometry3D) o;
        return Double.compare(that.startX, startX) == 0 &&
                Double.compare(that.startY, startY) == 0 &&
                Double.compare(that.startZ, startZ) == 0;
    }

    @Override
    public String toString() {
        return "Geometry3D{" +
                "startX=" + startX +
                ", startY=" + startY +
                ", startZ=" + startZ +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(startX, startY, startZ);
    }

    @Override
    public void display() {
        System.out.println("print");
    }

    @Override
    public double area() {
        return 0.0;
    }

    public double volume(){
        return 0.0;
    }

    public int compareTo(Geometry3D ob){
        if (this.volume() < ob.volume()){
            return -1;
        } else if (this.volume() > ob.volume()){
            return 1;
        } else {
            return 0;
        }
    }
}
