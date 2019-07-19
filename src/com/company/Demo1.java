package com.company;
import java.util.Scanner;

public class Demo1 {
    static Scanner scanner = new Scanner(System.in);

    static int money = 10000;

    public static void main(String[] args) {
        caidan();
    }

    static void caidan() {
        while (true) {
            System.out.println("1.查看余额");
            System.out.println("2.存钱");
            System.out.println("3.取钱");
            System.out.println("4.转账");
            System.out.println("5.退出");
            System.out.println("请选择:");
            int a = scanner.nextInt();
            scanner.nextLine();
            switch (a) {
                case 1:
                    cha();
                    break;
                case 2:
                    cun();
                    break;
                case 3:
                    qu();
                    break;
                case 4:
                    zhuan();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("没有此项");
                    return;
            }
        }
    }

    static void cha() {
        System.out.println("余额为:" + money);
    }

    static void cun() {
        System.out.println("请输入需要存的钱:");
        int a = scanner.nextInt();
        scanner.nextLine();
        money = money + a;
        System.out.println("存款后的余额:" + money);
    }

    static void qu() {
        System.out.println("请输入需要取的钱:");
        int a = scanner.nextInt();
        scanner.nextLine();
        if (a < money) {
            money = money - a;
            System.out.println("取款后的余额:" + money);
        } else {
            System.out.println("余额不足");
        }
    }

    static void zhuan() {
        System.out.println("请输入需要转的钱:");
        int a = scanner.nextInt();
        scanner.nextLine();
        if (a < money) {
            money = money - a;
            System.out.println("转账后的余额:" + money);
        } else {
            System.out.println("余额不足");
        }
    }
}
