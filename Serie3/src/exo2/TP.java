package exo2;

import java.util.Objects;

public class TP extends Employee {

    private float nbh;
    private float cost;

    public TP(String lastName, String firstName, float nbh, float cost) {
        super(lastName, firstName);
        this.nbh = nbh;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TP tp = (TP) o;
        return Float.compare(tp.nbh, nbh) == 0 &&
                Float.compare(tp.cost, cost) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nbh, cost);
    }

    public float getNbh() {
        return nbh;
    }

    public void setNbh(float nbh) {
        this.nbh = nbh;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "TP{" +
                "nbh=" + nbh +
                ", cost=" + cost +
                '}';
    }

    @Override
    public float getSalary() {
        return nbh * cost;
    }
}
