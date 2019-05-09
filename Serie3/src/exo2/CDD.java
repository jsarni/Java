package exo2;

import java.util.Objects;

public class CDD extends Employee{

    private float sb;
    private float prime;

    public CDD(String lastName, String firstName, float sb, float prime) {
        super(lastName, firstName);
        this.sb = sb;
        this.prime = prime;
    }

    public float getPrime() {
        return prime;
    }

    public void setPrime(float prime) {
        this.prime = prime;
    }

    public float getSb() {
        return sb;
    }

    public void setSb(float sb) {
        this.sb = sb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CDD cdd = (CDD) o;
        return Float.compare(cdd.sb, sb) == 0 &&
                Float.compare(cdd.prime, prime) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sb, prime);
    }

    @Override
    public String toString() {
        return "CDD{" +
                "sb=" + sb +
                ", prime=" + prime +
                '}';
    }

    @Override
    public float getSalary() {
        return sb + prime;
    }

}
