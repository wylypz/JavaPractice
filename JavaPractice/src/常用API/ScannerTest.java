package 常用API;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        // 创建一个Scanner扫描器
        Scanner sc = new Scanner(System.in);

        boolean boo = sc.nextBoolean();
        System.out.println(boo);
        int i = sc.nextInt();
        System.out.println(i);
        String st1 = sc.next();
        System.out.println(st1);
        String st2 = sc.next();
        System.out.println(st2);
        String st3 = sc.next();
        System.out.println(st3);

    }
}
