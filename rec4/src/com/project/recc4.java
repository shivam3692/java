package com.project;
import java.util.*;
public class recc4 {
    public static int  factorial(int n){
        if(n==1||n==0){
            return 1;
        }

        return n*factorial(n-1);

    }



    public static void main(String[] args){
System.out.print(factorial(5));

    }
}
