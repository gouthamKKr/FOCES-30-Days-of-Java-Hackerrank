/*Day Two 
In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. */

import java.util.*;

public class Java_Stdin_and_Stdout_I{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println("First integer is :"+a);
        System.out.println("Second integer is :"+b);
        System.out.println("Third integer is :"+c);
}
}
