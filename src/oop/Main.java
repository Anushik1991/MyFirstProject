package oop;

class Main {
    public static void main(String[] args) {
        Car.brand = "BMW"; //clas variables,,
        Car car1 = new Car();
        car1.setColor("Red");
        car1.setYears(2000);

        car1.runSpead();
        System.out.println("Vot" + car1.getColor() + " " + car1.getYears());
        car1.carInfo();

        Car car2 = new Car();
        car2.setColor("Bleu");
        car2.setYears(1998);
        car2.carInfo();


        Car car3 = new Car("Black",2001);
        car3.carInfo();

        Car car4 = new Car("red");
        car4.carInfo();

        Car car5 = new Car(2015);
        car5.carInfo();

        // Cats objects

        Cats.rod = "British";
        Cats cat1 = new Cats();
        cat1.color = "ginger";
        cat1.name = "Pushistk";
        cat1.age = 2;
        cat1.CatInfo();
        cat1.CatMew();

        // rectangle broblem solve

        Rectangle ab = new Rectangle(3,2);
        System.out.println(ab.getArea());
        System.out.println(ab.getPerimeter());

        //Emploee with constructor

        Employee employee = new Employee("Anna","trader",5000,3);
        employee.employeeInfo();
        employee.calculateSalary();
        employee.employeeInfo();
        employee.updateSalary();

        //Emploee

        Employee employee1 = new Employee();
        employee1.setName("Anna");
        employee1.setJobTitle("QA");
        employee1.setSalary(1000);
        employee1.setYears(3);
        employee1.employeeInfo();
        employee1.calculateSalary();
        employee1.employeeInfo();
        employee1.updateSalary();
        employee1.setAddress("Komitas 18");
        System.out.println(employee1.getAddress());



        //Student
        Student student = new Student();
        student.studentName = "Akop Akopyan";
        student.facultet = "finance";
        student.rating = 80.1;
        student.studentInfo();
        student.getDiscount();
        System.out.println("Vot" + InfoStatic.getInfoStudent(student));

        //bike
        Bike bike = new Bike("Maruti", "Waggon R",1000,12);
        System.out.println(bike.company + "'s" + bike.model + "has enginie power of" + bike.cc + "cc");


















    }



}
