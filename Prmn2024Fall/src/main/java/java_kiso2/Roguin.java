package java_kiso2;

import java.util.Scanner;

public class Roguin {
    String[][] gakusei = {
            {"B2230010", "abc"},
            {"B2230020", "def"},
            {"B2230030", "ghi"},
            {"B2230040", "jkl"},
            {"B2230050", "mno"},
    };

    void hantei(String gakuseki) {
        for (int i = 0; i < gakusei.length; i++) {
            if (gakusei[i][0].equals(gakuseki)) {
                System.out.print("パスワードを入力してください：");
                Scanner sc = new Scanner(System.in);
                String password = sc.nextLine();
                if (gakusei[i][1].equals(password)) {
                    System.out.println("ログイン完了");
                    return;
                }
                else {
                    System.out.println("不正なアクセス");
                    System.exit(0);
                }
            }
        }
        System.out.println("error!!");
        System.exit(0);
    }
}