import abc.Bank;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Hey I am writing");
    }

    public void printColor(){
        System.out.println(this.color);
    }

    public void printColor(String s1){
        System.out.println("Function Overloading....");
        System.out.println(this.color+" " +s1);
    }

    public void printType(){
        System.out.println(this.type);
    }

    Pen(){              // Deafault Constructor

    }

    Pen(Pen obj){ 
        System.out.println("Copy Constructor....");
        this.color = obj.color;                                          
        this.type = obj.type;                                         
    }

    
}

    

public class OOPs{
    public static void main(String[] args) {
        Pen obj = new Pen();

        String s1 = "Green";
        obj.color = "Blue";
        obj.type = "Ballpoint";

        Pen obj2 = new Pen();
        obj2.color = "Black";
        obj2.type = "Gel";

        obj.write();

        obj.printColor();
        obj.printColor(s1);
        obj2.printColor();

        obj.printType();
        obj2.printType();

        Pen obj3 = new Pen(obj);  //Copy Constructor called
        obj3.printColor();
        obj3.printType();


        Bank obj5 = new Bank();
        obj5.Account();
        obj5.AccountNo();
    }
    
}