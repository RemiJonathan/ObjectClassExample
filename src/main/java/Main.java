import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double gradeToSet;
        Student student = new Student("Ellie", 25, "female", 75.00);

        //While the student isn't passing OR has an impossible grade (grade>100)
        //Ask the user to input a valid grade
        while (student.getGrade() < 60.0 || student.getGrade() > 100.0) {
            System.out.println("What is the student's grade?");
            student.setGrade(input.nextDouble());
        }


        //Using do while therefore this line must execute at least once
        do {
            System.out.println("What is the student's grade?");
            student.setGrade(input.nextDouble());
        } while (student.getGrade() < 60.0 || student.getGrade() > 100.0);

        System.out.println(student.getName() + "'s grade is : " + student.getGrade());


        //Using a for loop to display a visual representation of the grade
        System.out.print("This is the grade bar : [");
        for (int i = 1; i < student.getGrade() / 10; i++) {
            System.out.print("X");
        }
        System.out.print("]");
    }
}
