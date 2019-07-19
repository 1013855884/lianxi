package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class ShuiXianHua {
    public static void main(String[] args) {
        for ( int x=100;x<999 ;x++){
            int bai = x/100%10;
            int shi = x/10%10;
            int ge = x%10;
            if(x == bai*bai*bai+shi*shi*shi+ge*ge*ge){
                System.out.println("水仙花数"+x);
            }
        }
    }
}
