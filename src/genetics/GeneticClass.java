package genetics;

import java.util.List;

/**
 * Created by Sizwe on 2016/12/08.
 */
public class GeneticClass<T> {
    T obj;

    void add(T obj) {
        this.obj = obj;
    }

    T get() {
        return obj;
    }


    static <B> void printArray(B[] e) {
        for (B element : e) {
            System.out.printf("%s  ", element);
        }
        System.out.println();
    }
}

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println(Rectangle.class.getSimpleName());
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println(Circle.class.getSimpleName());
    }
}