package preambule.casb;

import java.util.Objects;

public class Person {

    private String lastName;
    private String firstName;
    private int age;
    private Person parent1;
    private Person parent2;

    public Person(String lastName, String firstName, int age, Person parent1, Person parent2) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.parent1 = parent1;
        this.parent2 = parent2;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getParent1() {
        return parent1;
    }

    public void setParent1(Person parent1) {
        this.parent1 = parent1;
    }

    public Person getParent2() {
        return parent2;
    }

    public void setParent2(Person parent2) {
        this.parent2 = parent2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(parent1, person.parent1) &&
                Objects.equals(parent2, person.parent2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, age, parent1, parent2);
    }
}
