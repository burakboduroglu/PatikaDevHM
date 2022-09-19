public class Student {
    String name;
    String number;
    Course c1;
    Course c2;
    Course c3;
    Double average;
    boolean isPass;

    Student(String name, String number, Course c1, Course c2, Course c3) {
        this.name = name;
        this.number = number;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }


    void examNote(int note1, int note2, int note3) {
        if ((note1 < 0 || note1 > 100) || (note2 < 0 || note2 > 100) || (note3 < 0 || note3 > 100)) {
            System.out.println("Exam marks are not true.");
        } else {
            this.c1.note = note1;
            this.c2.note = note2;
            this.c3.note = note3;
            average = calcAverage();
            isPass();
            if (isPass()) {
                System.out.println("You have passed!!! Average : " + average);
            } else {
                System.out.println("You have not passed!!! Average : " + average);
            }
        }
    }

    Double calcAverage() {
        double average = (this.c1.note + this.c2.note + this.c3.note) / 3;
        return average;
    }

    Boolean isPass() {
        boolean result = false;
        if (calcAverage() >= 50) {
            result = true;
        }
        return result;
    }
}
