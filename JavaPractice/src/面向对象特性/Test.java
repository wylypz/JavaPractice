package 面向对象特性;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;
        a = b++;//10
        c = --a;//9
        b = ++a;//10
        a = c--;//9
         int d = a>b?100:20;
        System.out.println(a);      //9
        System.out.println(b);      //10
        System.out.println(c);     //8
        System.out.println(d);     //20

    }
}
