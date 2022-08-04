import java.util.Scanner;

public class Professor {
   private String Pname;
   private String pId;
   private level sth;


   Professor(String Proname, String profid){
       checkprofnumber(profid);
       this.Pname=Proname;
   }
    enum level
    {
        ostadyar,
        danshyar,
        ostdtmam
    }
     void checkprofnumber(String profnum){
         Scanner scn = new Scanner(System.in);
         profnum=scn.nextLine();
       if (profnum.length() !=7)
       {
           System.out.println("prof id should be 7 digit");
       }
       this.pId = profnum;
    }
    public String getprofid(){return pId;}
    public void setprofid(String proffid){this.pId=proffid;}
    public String getprofname(){return Pname;}
    public void setprofname(String proffname){this.Pname=proffname;}
    public String proflevel(){return this.sth.toString();}
}
