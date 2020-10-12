import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int year=scan.nextInt();
        if (year % 400 == 0) {
            System.out.println(year+" is a leap year");
        }
        else if (year % 100 == 0) {
            System.out.println(year+" is not a leap year");
        }

        else if (year % 4 == 0) {
            System.out.println(year+" is a leap year");
        }

        else {
            System.out.println(year+" is not a leap year");
        }
    }
}
