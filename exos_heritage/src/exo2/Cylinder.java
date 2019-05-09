package exo2;

import java.util.Objects;

public class Cylinder extends Geometry3D {

    private double rayon;
    private double hauteur;

    public Cylinder(double startX, double startY, double startZ, double rayon, double hauteur) {
        super(startX, startY, startZ);
        this.rayon = rayon;
        this.hauteur = hauteur;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cylinder cylinder = (Cylinder) o;
        return Double.compare(cylinder.rayon, rayon) == 0 &&
                Double.compare(cylinder.hauteur, hauteur) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rayon, hauteur);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "rayon=" + rayon +
                ", hauteur=" + hauteur +
                '}';
    }

    @Override
    public double area() {
        return 2*PI*rayon*hauteur;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("rayon : "+rayon + " ; hauteur : "+hauteur);
    }

    @Override
    public double volume() {
        return PI*rayon*rayon*hauteur;
    }
}
