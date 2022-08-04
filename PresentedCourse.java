import java.util.ArrayList;
import java.util.Scanner;

public class PresentedCourse {
            private String classnumber;
            private Course cors;
            private Professor prof;
            private Term term;
            private String clssid_kamel;


    PresentedCourse(String clsnum, Course cor, Professor pro, Term ter) {
        checkclsnumber(clsnum);
        this.cors = cor;
        this.prof = pro;
        this.term = ter;
        makeclasid();
    }

    public PresentedCourse(ArrayList<Course> cors, ArrayList<Professor> prof, ArrayList<Term> terms) {
    }

    void checkclsnumber(String clsnum){
            Scanner scn = new Scanner(System.in);
            clsnum=scn.nextLine();
            if(clsnum.length() !=10){
            System.out.println("class number should be 10 digit");
        }
        this.classnumber=clsnum;
    }
        private void makeclasid(){
        clssid_kamel= term.getyear()+
                term.getWnimsaal()+
                prof.getprofname().substring(0,2)+
                cors.getCoName().substring(0,2);
        }
    public Term getterm(){return term;}
    public String getclassnumber(){return classnumber;}
    public Professor getprof(){return prof;}
    public Course getcors(){return cors;}



}
