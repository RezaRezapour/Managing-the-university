import java.util.Scanner;

public class Student {
    private String id;
    private String Sname;

    public Student(String sid , String stuname){
            checksname(stuname);
            checksid(sid);
    }

    public void checksname(String studentname){
        Scanner scn = new Scanner(System.in);
        studentname=scn.nextLine();
        if(studentname.length()>20 && studentname.length()<3)
        {
            System.out.println("Student name should  bigger than 3 and lesser than 20");
        }
        this.Sname=studentname;
    }
    public void checksid(String sid){
        Scanner scn = new Scanner(System.in);
        sid=scn.nextLine();
        if (sid.length()!=7)
        {
            System.out.println("student id should be 7 digit");
        }
    }
    public String getstudentid(){return this.id;}
    public void setstudentid(String sid){this.id=sid;}

    public String getstudentname(){return this.Sname;}
    public void setstudentname(String snm){this.Sname=snm;}

}
