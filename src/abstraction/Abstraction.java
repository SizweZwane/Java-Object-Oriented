package abstraction;

/**
 * Created by Sizwe on 2016/12/07.
 */
public class Abstraction {
    public static void main(String[] args) {
        ImplentePerson person = new ImplentePerson();
        person.sayHi();
        person.run();
    }
}

abstract class Person {

    static void sayHi() {
        System.out.println("Hi");
    }

    abstract void run();
}

class ImplentePerson extends Person{
    @Override
    void run() {
        System.out.println("Maaaan I'm running.");
    }
}