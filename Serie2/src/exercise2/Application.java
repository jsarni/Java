package exercise2;

import java.util.ArrayList;
import java.util.Objects;

public class Application {

    private ArrayList<ArrayList<Mark>> marks;

    public Application() {
        this.marks = new ArrayList<ArrayList<Mark>>();
    }

    public ArrayList<ArrayList<Mark>> getMarks() {
        return marks;
    }

    public ArrayList<Mark> getStudent(int rank){
        return this.marks.get(rank);
    }


    public int getMarkIndexWithSubject(int studentRank, String subject){
        ArrayList<Mark> curStudent = this.getStudent(studentRank);
        for (Mark m: curStudent) {
            if (m.getSubject().equals(subject)){
                return curStudent.indexOf(m);
            }
        }
        return -1;
    }
    public boolean addMark(float value, String subject, int rank){
        Mark mark = new Mark(value, subject);
        if (rank >= this.getMarks().size()){
            System.out.println("No such student found, creating a new student, with the following rank : "+this.marks.size());
            ArrayList<Mark> student = new ArrayList<Mark>();
            student.add(mark);
            this.getMarks().add(student);
            return true;
        } else {
            this.getStudent(rank).add(mark);
            return true;
        }
    }

    public boolean removeMark(int studentRank, String subject)throws IndexOutOfBoundsException{
        if (studentRank >= this.getMarks().size()){
            throw new IndexOutOfBoundsException("Unknown student !");
        }
        int indexOfMark = this.getMarkIndexWithSubject(studentRank, subject);
        if (indexOfMark == -1){
            System.out.println("Error, no mark found for the specified subject concerning this student");
            return false;
        }
        this.getStudent(studentRank).remove(indexOfMark);
        return true;
    }

    public void print(){
        if (this.getMarks().size() == 0){
            System.out.println("No marks to print");
        } else {
            for (int i = 0; i <this.getMarks().size(); i++){
                System.out.println("Marks for the student : "+i);
                if (this.getStudent(i).size() == 0){
                    System.out.println("This student has no marks.");
                    System.out.println();
                }
                for (Mark m : this.getStudent(i)){
                    System.out.println("Subject : "+m.getSubject());
                    System.out.println("Mark : "+m.getValue());
                    System.out.println();
                }
            }
        }
    }

    public float average(int rank) throws IndexOutOfBoundsException{
        if (this.getMarks().size() < rank){
            throw new IndexOutOfBoundsException("No such student found");
        }
        ArrayList<Mark> student = this.getStudent(rank);
        float sum = 0;
        for(Mark m : student){
            sum += m.getValue();
        }
        return sum/student.size();
    }

    public int compute(){
        if(this.getMarks().size() == 0){
            return 0;
        }
        int max = 0;
        for (ArrayList<Mark> student : this.getMarks()){
            if (max < student.size()){
                max = student.size();
            }
        }
        return max;
    }

    public float[] avgs() throws NullPointerException{
        if(this.getMarks().size() == 0){
            throw new NullPointerException("No student found !");
        }
        int numberOfStudents = this.getMarks().size();
        float[] avgs = new float[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++){
            avgs[i] = average(i);
        }
        return avgs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Application that = (Application) o;
        return Objects.equals(marks, that.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marks);
    }

    @Override
    public String toString() {
        return "Application{" +
                "marks=" + marks +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
