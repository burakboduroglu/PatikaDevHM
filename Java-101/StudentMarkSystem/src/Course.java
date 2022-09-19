public class Course {
    String name;
    String prefix;
    Teacher courseTeacher;
    int note;

    Course(String name, String prefix) {
        this.name = name;
        this.prefix = prefix;

    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.courseTeacher = teacher;
            System.out.println("Teacher added.");
        }  else {
            System.out.println("Teacher has not added.");
        }
    }

    void teacherDetail(){
        System.out.println("Name : " + this.courseTeacher.name);
        System.out.println("Branch : " + this.name);
        System.out.println("Phone : " + this.courseTeacher.phone);
    }
}
