package exo2;

import exo2.shapes.shapes2D.*;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

    public static void main(String[] args){
        ArrayList<Geometry2D> l = new ArrayList<>();
        l.add(new Rectangle(12.1,3.0,12,14));
        l.add(new Square("carre",-4.0,12.0,14));
        l.add(new Circle("cercle",0.0,0.0,12));
        l.add(new Ellipsis(-1.0,-3.0,12,14));
        Collections.sort(l);
        for(Geometry2D e : l){
            e.display();
        }
    }
}
