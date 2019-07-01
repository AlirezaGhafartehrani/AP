public class Student {
    private String firstName;
    private String lastName;
    private String studentID;
    private float grade;

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public void setStudentID (String ID) {
        studentID = ID;
    }

    public Student (String firstName, String lastName, String studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
    }

    public void setGrade (float grade) {
        this.grade = grade;
    }

    public char getGradeScale () {
        char s;
        if (grade >= 17 && grade <= 20) s='A';
        else if (grade >= 15 && grade < 17) s = 'B';
        else if (grade >= 13 && grade < 15) s = 'C';
        else if (grade >= 10 && grade < 13) s = 'D';
        else  s = 'F';
        return s;
    }

    public float getGrade () {
        return grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getInfo() {
        return "Name: " + firstName + " " + lastName + "\nStudent ID: " + studentID + "\nGrade: " + (int)grade;

    }

}
