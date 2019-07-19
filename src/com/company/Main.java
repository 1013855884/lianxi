package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("请输入头的个数:");
        Scanner scanner = new Scanner(System.in);
        int head = scanner.nextInt();
        System.out.println("请输入脚的个数:");
        int foot = scanner.nextInt();
        int y = 0;
        if (head > 0 && foot > 0 && foot > head) {
            y = foot / 2 - head;
            System.out.println("鸡:" + (head - y) + "兔子:" + y);
        } else {
            System.out.println("输入不合法");
        }
    }
}
