// Write a Java program to input marks of 5 subjects,
// calculate total marks, percentage
// , and assign grade based on percentage:
// A+: 90–100
// A: 80–89
// B: 70–79
// C: 60–69
// D: 50–59
// F: Below 50
// Display total, percentage, and grade.
import java.util.Scanner;

public class mains {
    public static void main(String[] args) {
        int totalMarks = 0;
        double percentage;
        String grade;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many subjects do you have? ");
        int totalSubject = sc.nextInt();
        
        for (int i = 1; i <= totalSubject; i++) {
            System.out.print("Enter your marks for Subject " + i + ": ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }
        percentage = (double) totalMarks / totalSubject;
        if (percentage >= 90 && percentage <= 100) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Total Marks Obtained: " + totalMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        sc.close();
    }
}
