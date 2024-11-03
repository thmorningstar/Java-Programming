import java.util.*;

class Student
{
    int roll;
    String student_name;
}


public class Main__1 {
    public static void main(String[] args) {
        Student obj1 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student roll number: ");
        obj1.roll = sc.nextInt();
        sc.nextLine();
        System.out.println("Student roll number is : "+obj1.roll);
        System.out.println("Enter student name: ");
        obj1.student_name = sc.nextLine();
        System.out.println("Student name is : "+obj1.student_name);
        sc.close();
    }
    
}
