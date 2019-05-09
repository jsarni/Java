package exo2;

import java.util.Objects;

public class CDI extends Employee{

    private float sb;

    public CDI(String lastName, String firstName, float sb) {
        super(lastName, firstName);
        this.sb = sb;
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
        if (!super.equals(o)) return false;
        CDI cdi = (CDI) o;
        return Float.compare(cdi.sb, sb) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sb);
    }

    @Override
    public String toString() {
        return "CDI{" +
                "sb=" + sb +
                '}';
    }

    @Override
    public float getSalary() {
        return getSb();
    }
}
