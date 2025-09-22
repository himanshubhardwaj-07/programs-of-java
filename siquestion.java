
import java.util.*;

class SI {

    double si;

    void calculateSI() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        int p = sc.nextInt();

        System.out.print("Enter time (years): ");
        int t = sc.nextInt();

        System.out.print("Enter the rate: ");
        double r = sc.nextDouble(); // fixed to nextDouble

        si = (p * r * t) / 100;

        System.out.println("Simple Interest calculated: " + si);
    }
}

class SIData extends SI {

    void display() {
        // call calculateSI first to compute SI
        calculateSI();
        System.out.println("These are the details: Simple Interest = " + si);
    }
}

public class siquestion {

    public static void main(String[] args) {
        SIData obj = new SIData();
        obj.display();  // calls calculateSI and prints
    }
}
