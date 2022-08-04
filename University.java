import java.util.ArrayList;
import java.util.Scanner;
public class University{
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Course> cors = new ArrayList<>();
    ArrayList<Term>  terms = new ArrayList<>();
    ArrayList<Professor> prof= new ArrayList<>();
   private ArrayList<PresentedCourse> prcors = new ArrayList<>();
    ArrayList<Register> reg = new ArrayList<>();
    ArrayList<Mark> markes = new ArrayList<>();
    Scanner scn = new Scanner(System.in);

    public static void main(String[] args){

        University uni = new University();
        Scanner scn = new Scanner(System.in);
        String i;
        boolean flag = true;
        while (flag) {
            uni.showMenu();
            i = scn.nextLine();
            switch (i) {
                case "1":
                    uni.Addstudent();
                    break;
                case "2":
                    uni.deleteStudent();
                    break;
                case "3":
                    uni.addcourse();
                    break;
                case "4":
                    uni.deleteCourse();
                    break;
                case "5":
                    uni.addProfessor();
                    break;
                case "6":
                    uni.deleteProfessor();
                    break;
                case "7":
                    uni.addterm();
                    break;
                case "8":
                    uni.deleteterm();
                    break;
                case "9":
                    uni.presentCourse();
                    break;
                case "10":
                    uni.RegisterStudent();
                    break;
                case "11":
                    uni.enterMark();
                    break;
                case "12":
                    uni.findMaxMark();
                    break;
                case "13":
                    uni.findStudentGPA();
                    break;
                case "14":
                    uni.printCourseInfo();
                    break;
                case "15":
                    uni.printStudentInfo();
                    break;
                case "16":
//                    Print_Student_Transcript();
                    break;
                case "17":
                    flag = false;
                    break;
                default:
                    System.out.print("Invalid Argument, please enter a valid Number.\n");
            }
        }
    }


    public void Addstudent (){
        students.add(new Student(scn.nextLine(),scn.nextLine()));
    }
    public void deleteStudent (){
        System.out.println("Enter num");
        String idd = scn.nextLine();
        for(int i = 0 ; i < students.size() ; i++){
            if (students.get(i).getstudentid()==idd)
            {
                students.remove(i);
            }
        }
    }
    public void addcourse(){
        System.out.println("please enter lesson number");
        String lessonNumber = scn.nextLine();
        System.out.println("please enter lesson");
        String lesson = scn.nextLine();
        System.out.println("please enter unit");
        float unit = scn.nextFloat();
        System.out.println("please enter number prerequisite");
        int i = scn.nextInt();
        ArrayList<String> prerequisite = new ArrayList<>();
        for(int j=0;j<i;j++){
            System.out.println("please enter lesson for prerequisite");
            String a =scn.nextLine();
            prerequisite.add(a);
        }
        cors.add(new Course(lessonNumber,lesson,prerequisite,unit));
    }

    public void deleteCourse() {
        System.out.println("please enter lesson number");
        String id = scn.nextLine();
        for (int i = 0; i < cors.size(); i++)
            if (cors.get(i).getCoid() == id)
                cors.remove(i);
    }
    public void addProfessor(){
        System.out.println("please enter professor id");
        String professorId = scn.nextLine();
        System.out.println("please enter professorName");
        String professorName = scn.nextLine();

        System.out.println("please enter number prerequisite");
        prof.add(new Professor(professorName, professorId));

    }
    public void deleteProfessor() {
        String id = scn.nextLine();
        for (int i = 0; i < prof.size(); i++)
            if (prof.get(i).getprofid().equals(id))
                prof.remove(i);
    }
    public void addterm(){
        System.out.println("Enter Start year");
        int year = scn.nextInt();
        System.out.println("enter ur term (true or falsse");
        boolean bb = scn.nextBoolean();
        terms.add(new Term(year, bb));
    }
        public void deleteterm(){
            System.out.println("Enter ur year of term");
            int year = scn.nextInt();
            System.out.println("enter ur term (true or falsse)");
            boolean bb = scn.nextBoolean();
            for (int i = 0; i < terms.size(); i++)
                if (terms.get(i).getyear()==year
                    &&
                     terms.get(i).getnimsal()==bb)
                    terms.remove(i);
        }
    public void presentCourse() {
        for (int i = 0; i < cors.size(); i++) {
            System.out.print(i+".");
            System.out.println(cors.get(i).getCoid());
        }
        System.out.println("please enter lesson number(int)");
        Course course = cors.get(scn.nextInt());

        int i=0;
        for(Professor pro : prof){
            System.out.print(i+".");
            System.out.println(pro.getprofid());
            i++;
        }
        System.out.println("please enter Professor Id(int)");
        Professor pro = prof.get(scn.nextInt());

        for(int j = 0; j < terms.size(); j++) {
            System.out.print(j+".");
            System.out.println(terms.get(i).getyear());
        }
        System.out.println("please enter Year(int)");
        Term term = terms.get(scn.nextInt());

        prcors.add(new PresentedCourse(cors , prof , terms));
    }
    public void RegisterStudent() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(i + " . ");
            System.out.println(students.get(i).getstudentid());
        }
        System.out.println("Enter Std id");
        Student std = students.get(scn.nextInt());
        for (int j = 0; j<prcors.size(); j++){
            System.out.println(prcors.get(j).getclassnumber());
        }
        System.out.println("please enter number");
        PresentedCourse pre = prcors.get(scn.nextInt());
        System.out.println("enter your term (0 or 1)");
        reg.add(new Register(std, pre));
    }
    public void enterMark(){
        for(int k=0;k<prcors.size();k++){
            System.out.print(k+".");
            System.out.println(prcors.get(k).getclassnumber());
        }
        System.out.println("please enter number");
        PresentedCourse pre = prcors.get(scn.nextInt());
        ArrayList<Integer> marks = null;
        ArrayList<Student> student = null;
        for(int k=0;k<reg.size();k++){
            System.out.print(k+".");
            System.out.print(reg.get(k).getStudnt().getstudentname()+ "," + reg.get(k).getStudnt().getstudentid()+ ":");
            marks.add(scn.nextInt());
            student.add(reg.get(k).getStudnt());
        }
        markes.add(new Mark(student, pre, marks));
    }

    public void findMaxMark(){
        for(int k=0;k<prcors.size();k++){
            System.out.print(k+".");
            System.out.println(prcors.get(k).getclassnumber());
        }
        System.out.println("please enter ID");
        String pre = scn.nextLine();
        int max=0;
        for(Mark mark:markes){
            if(pre == mark.getPre().getclassnumber()){
                for(int k=0;k<mark.getMarks().size();k++){
                    if(mark.getMarks().size()>max){
                        max = mark.getMarks().size();
                    }
                }
            }
        }
        System.out.println(max);

    }

    public void  findStudentGPA(){
        double sum=0;
        double number=0;
        System.out.println("enter your student id");
        String id = scn.nextLine();
        for(int k=0;k<markes.size();k++){
            for(int j=0;j<markes.get(k).getStudnt().size();j++){
                if(markes.get(k).getStudnt().get(j).getstudentid()==id){
                    sum+=markes.get(k).getMarks().get(j);
                    number++;
                }
            }
        }
        System.out.println(sum/number);
    }


    public void printCourseInfo(){
        System.out.println("enter your lesson Number");
        String num=scn.nextLine();
        for(int k=0;k<cors.size();k++){

            if(num==cors.get(k).getCoid()){
                for (int j = 0; j < cors.get(k).getPishniaz().size(); j++) {
                    System.out.println(cors.get(k).getPishniaz().get(j));

                }
                break;
            }
        }
    }

    public void printStudentInfo(){
        System.out.println("enter your student id");
        String id = scn.nextLine();
        for (int j = 0; j < 10; j++) {
            if(students.get(j).getstudentid()==id){
                System.out.println("INFO:\n");
                System.out.println(students.get(j).getstudentname());
            }
        }
    }
    public void showMenu() {
        System.out.println(
                "Welcome to Shiraz University of Technology\n\n" +
                        "Please select your choise:\n\n" +
                        "1.  Add Student\n" +
                        "2.  Delete Student\n" +
                        "3.  Add Course\n" +
                        "4.  Delete Course\n" +
                        "5.  Add Professor\n" +
                        "6.  Delete Professor\n" +
                        "7.  Add Term\n" +
                        "8.  Delete Term\n" +
                        "9.  Present A Course\n" +
                        "10. Register A Student\n" +
                        "11. Enter Mark\n" +
                        "12. Find Max Mark\n" +
                        "13. Find Student GPA\n" +
                        "14. Print Course Info\n" +
                        "15. Print Student Info\n" +
                        "16. Print Student Transcript\n" +
                        "17. Exit\n\n\n"
        );
    }
}