import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double gradeToSet;
        Student student = new Student("Ellie", 25, "female", 75.00);

        //While the student isn't passing OR has an impossible grade (grade>100)
        //Ask the user to input a valid grade
        while(student.getGrade() < 60.0 || student.getGrade() >100.0){
            System.out.println("What is the student's grade?");
            student.setGrade(input.nextDouble());
        }


        //Using do while
        do{
            System.out.println("What is the student's grade?");
            gradeToSet = input.nextDouble();
        }while(gradeToSet < 60.0 || gradeToSet >100.0);

        student.setGrade(gradeToSet);

        System.out.println(student.getName()+"'s grade is : "+ student.getGrade());

        System.out.print("This is the grade bar : [");
        for(int i = 1; i<student.getGrade()/10; i++){
            System.out.print("X");
        }
        System.out.print("]");
    }
}












class Student {
    private String name;
    private int age;
    private String gender;
    private double grade;

    //Student s = new Student("Remi Jonathan", 21, "Male", 92.5);
    public Student(String n, int a, String gen, double gd) {
        name = n;
        age = a;
        gender = gen;
        grade = gd;
    }

    //String studentName = student.getName();
    public String getName(){
        return name;
    }

    //student.setName("Pedro");
    public void setName(String n){
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}