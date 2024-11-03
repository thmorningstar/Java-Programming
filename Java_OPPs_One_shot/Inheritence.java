import abc.Bank;

class Shapes{
    public void area(){
        System.out.println("Display Area");
    }
}

class Reactangle extends Shapes{
    public void area(int length, int breath){
        System.out.println(length * breath);
    }
}

public class Inheritence {
    public static void main(String[] args) {
       Reactangle obj = new Reactangle();
       obj.area();
       obj.area(10,20);

       Bank obj5 = new Bank();
        obj5.Account();
        obj5.AccountNo();
    }
}
