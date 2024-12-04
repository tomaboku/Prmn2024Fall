package java_kiso2;

import java.util.Scanner;

public class prac3 {
    public static void main(String[] args) {
        System.out.print("学籍番号を入力してください：");
        Scanner sc = new Scanner(System.in);
        String gakuseki = sc.nextLine();

        Roguin roguin = new Roguin();
        roguin.hantei(gakuseki);
    }
}
