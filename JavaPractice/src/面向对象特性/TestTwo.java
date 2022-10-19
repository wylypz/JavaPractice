package 面向对象特性;

public class TestTwo {
    public static void main(String[] args) {
        Phone p1=new Phone();

        p1.price=2899;

        test(p1);
        System.out.println(p1.price);           // 2899 or 3899?

        int i=20;
        test2(i);

        System.out.println(i);                  // 20 or 50?

        Iphone ip1 = new Iphone(222,"14promax",12);
    }

    public static void test(Phone p){
        p.price=3899;
    }

    public static void test2(int i){
        i=50;
    }

}
