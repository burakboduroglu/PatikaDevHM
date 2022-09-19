public class Main {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Burak", "MATH", "123456789");
        Teacher teacher2 = new Teacher("Ali", "PHY", "321654987");
        Teacher teacher3 = new Teacher("Mehmet", "CHEM", "987456321");

        Course course1 = new Course("Mathematics", "MATH");
        course1.addTeacher(teacher1);
        course1.teacherDetail();
        System.out.println("------------------------");

        Course course2 = new Course("Physics", "PHY");
        course2.addTeacher(teacher2);
        course2.teacherDetail();
        System.out.println("------------------------");

        Course course3 = new Course("Chemistry", "CHEM");
        course3.addTeacher(teacher3);
        course3.teacherDetail();
        System.out.println("------------------------");

        Student student1 = new Student("Ahmet", "654987123", course1, course2, course3);
        student1.examNote(85,90,70);
        System.out.println("------------------------");

    }
}
