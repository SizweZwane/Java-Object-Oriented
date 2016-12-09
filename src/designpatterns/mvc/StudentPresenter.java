package designpatterns.mvc;

/**
 * Created by HP on 2016/12/09.
 */
public class StudentPresenter {
    // The presenter has access to both the Model and View class so....
    private StudentModel studentModel = new StudentModel();
    private StudentView studentView = new StudentView();

    public StudentPresenter(StudentModel studentModel, StudentView studentView) {
        this.studentModel = studentModel;
        this.studentView = studentView;
    }

    public String getStudentName() {
        return studentModel.getStudentName();
    }

    public void setStudentName(String studentName) {
        studentModel.setStudentName(studentName);
    }

    public int getStudentNumber() {
        return studentModel.getStudentNumber();
    }

    public void setStudentNumber(int studentNumber) {
        studentModel.setStudentNumber(studentNumber);
    }

    public char getStudentGrade() {
        return studentModel.getStudentGrade();
    }

    public void setStudentGrade(char studentGrade) {
        studentModel.setStudentGrade(studentGrade);
    }

    public void updateView(){
        studentView.printStudent(this.getStudentName(), this.getStudentNumber(), this.getStudentGrade());
    }

}
