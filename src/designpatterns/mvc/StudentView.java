package designpatterns.mvc;

/**
 * Created by HP on 2016/12/09.
 */
public class StudentView {
    // P
    public void printStudent(String studentName, int studentNumber, char studentGrade) {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Student Grade: " + studentGrade);
    }
}
