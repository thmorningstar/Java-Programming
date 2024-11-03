class Student{
    String name = "Suraj";
    static String school;

    public static void changeSchool()
    {
        school = "newSchool";
    }
}


public class Ststic {
    public static void main(String[] args) {
        Student.school = "JNV";
        Student obj = new Student();
        //Student.changeSchool();
        System.out.println("My name is "+obj.name);
        System.out.println("My school name is "+Student.school);
    }
    
}
