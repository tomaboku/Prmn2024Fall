package java_kiso2;

public class Keisan {
    int goukei(int[] num) {
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }

    void hanntei(int sum) {
        if(sum < 50) {
            System.out.println("small");
        }
        else if(sum >= 50) {
            System.out.println("big");
        }
        else if(sum >= 100) {
            System.out.println("great!!");
        }
    }
}
