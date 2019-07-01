public class StudentTest {

    public static void main(String[] args) {
        Student std1 = new Student("hossein", "hesar", "9431000");
        std1.setGrade(17);
        System.out.println("Name: hossein hesar\nStudent ID: 9431000\nGrade: 17".equals(std1.getInfo()));
        System.out.println( 17 == std1.getGrade());
        System.out.println( 'A' == std1.getGradeScale());

        Student std2 = new Student("mehdi", "saber", "9525027");
        std2.setGrade(15);
        System.out.println( "Name: mehdi saber\nStudent ID: 9525027\nGrade: 15".equals(std2.getInfo()));
        System.out.println( 15 == std2.getGrade());
        System.out.println( 'B' == std2.getGradeScale());

        Student std3 = new Student("ali", "ansaripour", "9631000");
        std3.setGrade(9);
        std3.setFirstName("alireza");
        System.out.println( "Name: alireza ansaripour\nStudent ID: 9631000\nGrade: 9".equals(std3.getInfo()));
        System.out.println( 9 == std3.getGrade());
        System.out.println( 'F' == std3.getGradeScale());

    }

}
