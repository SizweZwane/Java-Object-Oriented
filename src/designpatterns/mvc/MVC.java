package designpatterns.mvc;

import java.util.Random;

/**
 * Created by HP on 2016/12/09.
 */
public class MVC {

    private static String[] studentNames = {"Iola Keitt", "Karolyn Hedden", "Judi Schindler", "Anette Harless",
            "Bethel Coble", "Sizwe Zwane", "Humberto Steve", "Julieta Griffie", "Violette Boutin",
            "Polly Colston", "Ignacia Wehling", "Alexandra Uy", "Rena Blackwood", "Tennie Seekins",
            "Lue Mckay", "Carroll Blye", "Porfirio Kirkham", "Angele Richeson", "Torie Braunstein ",
            "Tesha Vanwingerden", "Jacques Fason"};

    private static int[] studentNumbers = {216022535, 216080935, 216023042, 216005420, 216091456, 216021348, 216019550,
            216059603, 216029589, 216047087, 216080712, 216058942, 216077211, 216090142, 216060507,
            216080701, 216014862, 216008409, 216032622, 216039712, 216037901, 216002527, 216035516,
            216075600, 216040291, 216028410, 216026633, 216030180, 216012225, 216050084, 216000578,
            216019837, 216050682, 216031484, 216034192, 216001434, 216038581, 216044557, 216013142};

    private static char[] studentGrades = {'A', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static void main(String[] args) {
        StudentView view = new StudentView();
        StudentModel model = new StudentModel();
        StudentPresenter[] presenter = new StudentPresenter[10];
        for (int i = 0; i < presenter.length; i++) {
            presenter[i] = new StudentPresenter(model, view);
            presenter[i].setStudentName(studentNames[new Random().nextInt(21)]);
            presenter[i].setStudentNumber(studentNumbers[new Random().nextInt(39)]);
            presenter[i].setStudentGrade(studentGrades[new Random().nextInt(7)]);
            presenter[i].updateView();
            System.out.println();
        }
    }
}
