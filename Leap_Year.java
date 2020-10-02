import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Leap_yr {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int yr=scan.nextInt();
        if (yr % 400 == 0) {
            System.out.println("True");
        }
        else if (yr % 100 == 0) {
            System.out.println("False");
        }

        else if (yr % 4 == 0) {
            System.out.println("True");
        }

        else {
            System.out.println("False");
        }
    }
}
