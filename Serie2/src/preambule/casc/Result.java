package preambule.casc;

import java.util.HashMap;

public class Result {

    private HashMap<String, Float> marks; // premier String servira à encoder sous forme de chaine de caractère le couple (ID etudiant - Nom cours) exemple ('123245 - Java'), et le float représente la note

    public Result() {
        this.marks = new HashMap<String, Float>();
    }

    public HashMap<String, Float> getMarks() {
        return marks;
    }

    public void setMarks(HashMap<String, Float> marks) {
        this.marks = marks;
    }

}


