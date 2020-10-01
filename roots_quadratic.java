// Day 6 : Roots of Quadratic Equation

import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class roots_quadratic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int root = (b * b) - 4 * (a * c);
        double roots = sqrt(root);
        if (root > 0) {
            System.out.println("Real and Distinct");
            System.out.println(((-b - (int) roots) / (2 * a)) + " " + ((-b + (int) roots) / (2 * a)));
        } else if (root < 0) {
            System.out.println("Imaginary");
        } else {
            System.out.println("Real and Equal");
            System.out.println(((-b + (int) roots) / (2 * a)) + " " + ((-b - (int) roots) / (2 * a)));
        }
    }

}
