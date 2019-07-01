public class TestLab {
    public static void main(String[] args) {
            Lab AP = new Lab(0, 47);
            Student std1 = new Student("Ali", "Faraji", "9634024");
            std1.setGrade(20);
            Student std2 = new Student("Alireza", "tehrani ", "9627052");
            std2.setGrade(19.9f);
            AP.enrollStudent(std1);
            AP.enrollStudent(std2);

            Student[] stds = AP.getStudents();
            for (int i =0;i< AP.getCurrentCapacity(); i++){
                System.out.println(stds[i].getFirstName()+" Is In Lab Class.");
            }
        System.out.println("Average Is : "+AP.getAverage());

    }
}
