import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int total = 0;

        for(int i = 1; i <= n; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            int marks = sc.nextInt();
            total = total + marks;
        }

        double percentage = (double) total / n;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage);

        if(percentage >= 90) {
            System.out.println("Grade: A");
        }
        else if(percentage >= 80) {
            System.out.println("Grade: B");
        }
        else if(percentage >= 70) {
            System.out.println("Grade: C");
        }
        else if(percentage >= 60) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F");
        }
    }
}
