/*Day One*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class If_else {

        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int N = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
                if (N%2 == 1) {
                        System.out.println(" It is Weird");
                } else if (N>=2 && N<=5) {
                        System.out.println("It is Not Weird");
                } else if (N>=6 && N<=20) {
                        System.out.println("It is Weird");
                } else {
                        System.out.println("It is Not Weird");
                }

        }
}
