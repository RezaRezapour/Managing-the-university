import java.util.ArrayList;
import java.util.Scanner;

public class Course
{
    private String Coid;
    private String CoName;
    private ArrayList<String> pishniaz = new ArrayList<>();
    private float vhd;

    public Course(String Courseid, String CourseNAme, ArrayList<String> pishniazz,float vahed){
        this.Coid = Courseid;
        this.CoName = CourseNAme;
        this.vhd = vahed;
        this.pishniaz = pishniazz;

    }

    private void checkcoid(String Corid){
        Scanner scn = new Scanner (System.in);
        Corid=scn.nextLine();
        if (Corid.length()!= 5)
        {

            System.out.println("Your id should be 5 digit");
        }
        else this.Coid = Corid;
    }
    private void checkconame(String Corsname){
        Scanner scn = new Scanner(System.in);
        Corsname=scn.nextLine();
        if(Corsname.length()<20 && Corsname.length()>3)
        {
            System.out.println("Ur corname should be lesser than 20");

        }
            this.CoName = Corsname;
    }
    public String getCoName(){return this.CoName;}
    public String getCoid(){return this.Coid;}
    public ArrayList<String> getPishniaz(){return this.pishniaz;}
    public float getvahed(){return this.vhd;}
}
