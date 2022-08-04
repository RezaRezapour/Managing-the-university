import java.util.ArrayList;

public class Mark{

    public ArrayList<Student> getStudnt() {
        return student;
    }

    public PresentedCourse getPre() {
        return pre;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }


    public ArrayList<Student> student ;
    public PresentedCourse pre;
    public ArrayList<Integer> marks = new ArrayList<>();

    public Mark(ArrayList<Student> student, PresentedCourse pre,ArrayList<Integer> mark) {
        this.student = student;
        this.pre = pre;
        this.marks = mark;
    }


}
