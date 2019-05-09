package exo2;

import java.util.Objects;

public class Sphere extends Geometry3D{

    private String name;
    private double rayon;

    public Sphere(String name, double startX, double startY, double startZ, double rayon) {
        super(startX, startY, startZ);
        this.rayon = rayon;
        this.name = name;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("rayon : "+ rayon);
    }

    @Override
    public int compareTo(Geometry3D ob) {
        return super.compareTo(ob);
    }

    @Override
    public double area() {
        return PI*4*rayon*rayon;
    }

    @Override
    public double volume() {
        return 4 * PI * rayon * rayon * rayon / 3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Sphere sphere = (Sphere) o;
        return Double.compare(sphere.rayon, rayon) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rayon);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "rayon=" + rayon +
                '}';
    }
}
