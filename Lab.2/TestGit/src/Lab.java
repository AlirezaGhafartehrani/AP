public class Lab {
    private Student[] students;
    private int dayOfTheWeek;
    private int currentCapacity;
    private int finalCapacity;

    public Lab(int dayOftheWeek, int capacity) {
        this.dayOfTheWeek = dayOfTheWeek;
        finalCapacity = capacity;
        currentCapacity = 0;
        students = new Student[capacity];
    }

    public void enrollStudent(Student std) {
        if (currentCapacity < finalCapacity ) {
            students [currentCapacity] = std;
            currentCapacity ++;
        }
    }

    public Student[] getStudents() {
        return students;
    }

    public float getAverage() {
        float sum = 0;
        for (int i = 0 ; i < currentCapacity ; i++) {
            sum += students[i].getGrade();
        }
        return sum/currentCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public int getDayOfTheWeek() {
        return dayOfTheWeek;
    }
}
