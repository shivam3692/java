package com.project;

import java.util.*;
public class five_5 {
    public static void main(String[] args){
        Scanner dc = new Scanner(System.in);
        System.out.println("Enter the no" );
        int n =dc.nextInt();
        for(int i=1;i<=n;i++){
            //inner loop
           for (int j =n-i;j>=1;j--){
               System.out.print(" ");
           }



            for(int j=1; j<=i;j++){
                System.out.print(i+" ");
            }

            System.out.println();
        }









    }




}
