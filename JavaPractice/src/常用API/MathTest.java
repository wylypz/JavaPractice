package 常用API;

public class MathTest {
    public static void main(String[] args) {
        // 绝对值
        int abs = Math.abs(-20);
        System.out.println(abs);                // 20

        // 向上取整
        double ceil = Math.ceil(30.2);
        System.out.println(ceil);               // 31.0

        // 向下取整
        double floor = Math.floor(28.9);
        System.out.println(floor);              // 28.0

        // 四舍五入
        long r1 = Math.round(20.3);
        System.out.println(r1);                 // 20

        // 四舍五入
        long r2 = Math.round(20.5);
        System.out.println(r2);                 // 21

        // 生成0~1的随机数
        for (int i = 0; i < 20; i++) {
            System.out.println(Math.random());
        }

    }
}
