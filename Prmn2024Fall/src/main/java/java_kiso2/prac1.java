package java_kiso2;

import java.util.Scanner;

public class prac1 {
    public static void main(String[] args) {

        String number = "B2001000";

        Scanner scan = new Scanner(System.in);
        System.out.println("学籍番号を入力してください。：");
        String gakuseki = scan.next();

        Gakuseki gakuseki1 = new Gakuseki();
        gakuseki1.hantei(gakuseki, number);


    }
}
