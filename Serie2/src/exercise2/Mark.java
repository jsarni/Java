package exercise2;

import java.util.Objects;

public class Mark {
    private float value;
    private String subject;

    public Mark() {
    }

    public Mark(float value, String subject) {
        if (value >= 0 && value <= 20)
            this.value = value;
        this.subject = subject;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        if (value >= 0 && value <= 20)
            this.value = value;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mark mark = (Mark) o;
        return Float.compare(mark.value, value) == 0 &&
                Objects.equals(subject, mark.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, subject);
    }

    @Override
    public String toString() {
        return "Mark{" +
                "value=" + value +
                ", subject='" + subject + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}