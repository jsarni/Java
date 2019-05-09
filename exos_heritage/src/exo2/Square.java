package exo2;

public class Square extends Rectangle{

    private String name;

    public Square(String name, double X, double Y, double length) {
        super(X, Y, length, length);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
