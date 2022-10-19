package 反射;

public class GetClassObj {
    public static void main(String[] args) {
        // 获得Cate的Class的对象
        Class c1 = Cate.class;
        System.out.println(c1);

        Cate cate = new Cate();
        Class c2 = cate.getClass();
        System.out.println(c2);

        Class c3 = Class.forName("反射.Cate");
        // 打印输出: class 反射.Cate
        System.out.println(c3);

        System.out.println(c1 == c2);       // true
        System.out.println(c2 == c3);       // true


    }
}
