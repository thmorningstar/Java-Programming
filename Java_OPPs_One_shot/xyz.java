interface Animal{
    int eye = 2;
    public void walk();
}

interface Herbivore{
    int legs = 4;
    public void eat();
}

class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("Hey I walk on 4 legs");
        System.out.println("No. of eyes: "+eye);
    }

    public void eat()
    {
        System.out.println("I eat grass and grams");
        System.out.println("No. of legs: "+legs);

    }

}

public class xyz {
    public static void main(String[] args) {
        Horse obj = new Horse();
        obj.walk();
        obj.eat();
    }
    
}
