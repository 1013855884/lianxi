package com.company;

import sun.print.SunMinMaxPage;

import java.util.Arrays;
import java.util.Scanner;

public class QIuHe {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "g", "k", "l"};


        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入查找的单词:");
        String q = scanner.nextLine();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(q)) {
                System.out.println("Yes");
            }
        }
    }
}
