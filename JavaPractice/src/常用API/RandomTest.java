package 常用API;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int num = random.nextInt(10);
            System.out.println(num);

        }
        Scanner sc = new Scanner(System.in);
        Random rm1 = new Random();
        int max= sc.nextInt();
        for (int j = 0; j <10 ; j++) {
            int num = rm1.nextInt(max);
            System.out.println(num);

        }
    }
}
