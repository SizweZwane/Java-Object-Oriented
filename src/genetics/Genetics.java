package genetics;

import java.security.Signature;
import java.util.*;

/**
 * Created by Sizwe on 2016/12/08.
 */
public class Genetics {

    private static void drawShapes(List<? extends Shape> list){
        for(Shape shape: list){
            shape.draw();
        }
    }

    public static void main(String[] args) {
        GeneticClass<Integer> s = new GeneticClass<>();

        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        GeneticClass.printArray(intArray);
        GeneticClass.printArray(doubleArray);
        GeneticClass.printArray(charArray);

        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle());
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle());

        drawShapes(circles);
        drawShapes(rectangles);
    }
}
