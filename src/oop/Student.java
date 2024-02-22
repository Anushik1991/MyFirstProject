package oop;

public class Student {
        public static int courseNumber = 1;
        public String studentName;
        public String facultet;
        public double rating;

    public Student() {
        this.courseNumber = courseNumber;
        this.studentName = studentName;
        this.facultet = facultet;
        this.rating = rating;
    }

    public void studentInfo(){
        System.out.println("Сourse Number:" + courseNumber + "," + "Student name:" + studentName + "," + "facultet:" + facultet + "," + "rating:" + rating);
    }
    public void getDiscount() {
        if (rating >= 70 && rating <80) {
            System.out.println("Student gets the discount 10%");
        }
        else if (rating >= 80 && rating <90) {
            System.out.println("Student gets the discount 20%");
        }
        else if (rating>=90) {
            System.out.println("Student goes to on the free education");
        }else {
            System.out.println("Student doesnt get the discount ");
        }

    }
}
