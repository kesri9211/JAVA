package javaclass.StaticDemo;
//Created a class Teacher which has both static variable, instance variable, static method
public class Teacher {
   /* In our Teacher class we are taking three static and three instance variables
    Static variables will be shared among all the Teachers(objects) of the
    University as they will be common for every teacher.
    */
    static String minEligibility="Post Graduate";
    static int holidays=10;
    static int noOfTeacher=0;
/*For every object there is different value of instance variable*/
    String name;
    int id;
    int salary;
    /*We are using constructor to get details of a new teacher and every time
     new teacher joins the company we will increase the noOfTeacher variable with 1;
     */
    Teacher(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
        noOfTeacher++;
    }
/*static method are those method which can directly called without making object
which mean even if there is no teacher(no object is created), we can still modify the thing which is common
with all the teacher;
 */
    static void change_eligibility(String s){
        Teacher.minEligibility=s;
    }
//main function
    public static void main(String[] args) {
       /* We are creating three objects of teacher class, or we can
        also say that are adding three teachers in our company
        */
        Teacher T1=new Teacher("Kesri",101,100000);
        Teacher T2=new Teacher("Faraz",102,150000);
        Teacher T3=new Teacher("Arpita",103,140000);

        //print all details of teacher
        System.out.println("TEACHER 1 ->  NAME:"+T1.name+", ID:"+T1.id+", Salary:"+T1.salary);
        System.out.println("TEACHER 2 ->  NAME:"+T2.name+", ID:"+T2.id+", Salary:"+T2.salary);
        System.out.println("TEACHER 3 ->  NAME:"+T3.name+", ID:"+T3.id+", Salary:"+T3.salary);
        System.out.println();
        //Here priting the value which are shared my all the teacher
        System.out.println("Total number of teacher "+noOfTeacher);
        System.out.println("Minimum Elibility to become teacher is "+minEligibility);
        System.out.println("Leave every teacher can take "+holidays);

        /*Management decided to change the eligibility which is applicable to every teacher
        so change the value of static variable
         */
        
        change_eligibility("Pdh");
        System.out.println("New Minimum Elibility to become teacher is "+minEligibility);
    }
}
