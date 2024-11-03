    import java.util.*;

    class Lmn_College{

    String student;
    int student_id;
    }

    class Bca_student extends Lmn_College
    {
        Scanner sc = new Scanner(System.in);
        public void student_details()
        {
            System.out.println("Enter student name : ");
            student = sc.next();

            System.out.println("Enter student id : ");
            student_id = sc.nextInt();
        }
    }

    class Bba_student extends Lmn_College
    {
        Scanner sc = new Scanner(System.in);

        public void student_details()
        {
            System.out.println("Enter student name : ");
            student = sc.next();

            System.out.println("Enter student id : ");
            student_id = sc.nextInt();
        }

    }

    public class Inheritence_2
    {
        public static void main(String[] args) {
            Bca_student obj1 = new Bca_student();
            Bba_student obj2 = new Bba_student();

            obj1.student_details();
            obj2.student_details();

            System.out.println("BBA student name: " +obj1.student);
            System.out.println("BBA student ID: " +obj1.student_id);
            System.out.println("BCA student name: " +obj2.student);
            System.out.println("BCA student ID: " +obj2.student_id);
            
        }
    }
