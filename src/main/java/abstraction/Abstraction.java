

public class Abstraction {

    public static void main(String [] args) {

            myConcreteClass mcc = new myConcreteClass();

            mcc.clean();

            System.out.println("I just ran the Abstraction class");

            mcc.run();
            mcc.eat();
    }

}

abstract class myAbstractClass {
// An abstract class isn't required to have any method inside of it.
// If a method is placed inside of an abstract class, it isn't required to be abstract.

    abstract void run(); // If any concrete class extends this abstract class, it has to provide an implementation for all the abstract methods

     void eat() { // Abstract classes can have concrete methods with their own default implementations. The concrete classes that extend an abstract class do NOT need to provide their own implementations.
        System.out.println("Munch! Munch!");
    }
}

class myConcreteClass extends myAbstractClass{
    void clean () {}

    void run() {
        System.out.println("Sprint!"); // Required implementation
    }
}