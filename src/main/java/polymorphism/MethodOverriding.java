
public class MethodOverriding {

    public static void main(String [] args) {

        Lion lion1 = new Lion();
        System.out.println("Name with Lion Reference: " + lion1.name); // Instance variables look at the reference being used.
        System.out.println("Speak() method with Lion Reference: " + lion1.speak()); // Methods just run the child class implementation even if the reference is of the parent class. This is called Virtual Method Invocation.

        Animal lion2 = new Lion();
        System.out.println("Name with Animal Reference: " + lion2.name);
        System.out.println("Speak() method with Animal Reference: "  + lion2.speak());

        Son boy = new Son();
        System.out.println("Name with Son Reference: " + boy.name);
        System.out.println("Work() method with Son Reference: " + boy.work());

        Father dad = new Son();
        System.out.println("Name with Father Reference: " + dad.name);
        System.out.println("Work() method with Father Reference: "  + dad.work());
    }
}

abstract class Animal {

    String name = "Living Creature";

    abstract String speak();
}

class Lion extends Animal{

    String name = "Mufasa";

    String speak() {
        return "AAARRRRRRGGGHHHH";
    }

}

class Father {
    String name = "TheDad";

    String work() {
        return " I got bills!";
    }
}

class Son extends Father{
    String name = "TheBoy";

    String work() {
        return "I hate school!";
    }
}