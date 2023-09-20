package OOPS;

public class Student1 
{
    int S_id = 1233;
    String name = "Madesh";
    long phone_no = 789456123;
    double s_mark ;
    String emailid = "madesh@gmail.com";
    static String School_name = "ABC hr.sec.school";

    public  void displaydetails() 
    {
        System.out.println(S_id);
        System.out.println(name);
        System.out.println(phone_no);
        System.out.println(emailid);     
    }
    public static void schoolname() 
    {
        System.out.println(School_name);
    }
    public  void percentage(double newmark) 
    {
        if(s_mark>=0 && newmark>=0)
        {
            s_mark=newmark;
            System.out.println(s_mark+" % ");
        }
    }
   
    public static void main(String[] args) 
    {   
        new Student1().displaydetails();
        new Student1().percentage(79);
    }
}
