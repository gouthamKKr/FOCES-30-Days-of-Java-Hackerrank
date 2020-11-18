// Day 4:Calculator

import java.io.*;
import java.util.*;

public class Switch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum, diff, mul, div;
        if (num <= 100 && num >= -100) {
            switch (num) {
                case 1:
                    sum = a + b;
                    System.out.println(sum);
                    break;
                case 2:
                    diff = a - b;
                    System.out.println(diff);
                    break;
                case 3:
                    mul = a * b;
                    System.out.println(mul);
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Error");
                        break;
                    } else {
                        div = a / b;
                        System.out.println(div);
                        break;
                    }
                default:
                    System.out.println("Option not found");
                    break;
            }
        }
    }
}
