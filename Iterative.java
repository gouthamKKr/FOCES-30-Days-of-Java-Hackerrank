// Day 7

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        float sum=0;
        if(n<= 100 && n>=1){
            for(int i=0;i<n;i++){
            sum+=scan.nextInt();
        }
        }           
        System.out.println(sum/n);
    }
}
