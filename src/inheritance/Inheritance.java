package inheritance;

/**
 * Created by Sizwe on 2016/12/07.
 */
public class Inheritance {
    public static void main(String[] args) {
        Reptile reptile = new Reptile();
        Mammal mammal = new Mammal();
        System.out.println(reptile instanceof Mammal);
        System.out.println(reptile instanceof Reptile);
        System.out.println(reptile instanceof Animal);
        System.out.println();
        System.out.println(mammal instanceof Reptile);
    }
}

class Animal {}
class Mammal extends Animal {}
class Reptile extends Mammal {}