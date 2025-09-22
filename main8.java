// Q1. Student Result System
// You have a class Student.
// Attributes: name, rollNo, and ma rks of 5 subjects.
// Constructor: Initializes these values when you create a student object.
// Methods:
// totalMarks() → adds up all 5 marks.
// percentage() → divides total by max marks (500) × 100.
// grade() → decides grade A/B/C/F based on percentage.
// display() → shows everything together.
// Tip: Think: constructor sets up the student, methods calculate and show info.
// import java.util.*;

import java.util.*;

public class main8 {
    int size;
    int sumofnumbers = 0;
    double percentage;
    Scanner sc = new Scanner(System.in);

    void takeinput() {
        System.err.println("Enter the number Subjects youre have:");
        size = sc.nextInt();
        int[] totalsubno = new int[size];
        for (int number = 0; number < size; number++) {
            System.err.println("Enter Number you had in your subjects to:");
            totalsubno[number] = sc.nextInt();
        }
        for (int number = 0; number < size; number++) {
            System.out.println("Subject " + (number + 1) + ": " + totalsubno[number]);
        }
        for (int number = 0; number < size; number++) {
            sumofnumbers += totalsubno[number];
        }
        System.err.println("These are the number you had:" + sumofnumbers);
    }
     void findoutpercentage(){
         percentage = ((double)sumofnumbers/(size*100))*100;
        System.out.print("Total Percentage:"+percentage);
     }
        void findoutgrade(){
        if( percentage>=90){
            System.err.println("you got a grade.");
        } else if (percentage>=80){
            System.out.println("You  got b grade");
        }
        else if(percentage>=60){
            System.out.println("You got c grade");
        } else{
            System.out.print("You GOT D GARDE");
        }
        }
    public static void main(String[] args) {
        main8 obj = new main8();
        obj.takeinput();
        obj.findoutpercentage();
        obj.findoutgrade();
    }
}
