import java.util.ArrayList;

public class Register {

    private Student studnt;
    private Term ter;
    private ArrayList<PresentedCourse> prsntcors = new ArrayList<PresentedCourse>();
        Register(Student std , Term te, PresentedCourse prcors){
            this.studnt = std;
            this.ter=te;
           // this.prsntcors=prcors;
        }

    public Register(Student std, PresentedCourse pre) {
            studnt = std;
    }

    public Student getStudnt() { return studnt; }
    public void setStudnt(Student studnt) { this.studnt = studnt; }
    public Term getTer() { return ter; }
    public void setTer(Term ter) { this.ter = ter; }
    public ArrayList<PresentedCourse> getPrsntcors() { return prsntcors; }
    public void setPrsntcors(ArrayList<PresentedCourse> prsntcors) { this.prsntcors = prsntcors; }
}
