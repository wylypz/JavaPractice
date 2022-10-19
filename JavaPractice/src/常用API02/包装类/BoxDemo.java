package 常用API02.包装类;

public class BoxDemo {
    public static void main(String[] args) {
        Integer i = 4;		// 自动装箱。相当于Integer i = Integer.valueOf(4);
        i = i + 5;			// 等号右边：将i对象转成基本数值(自动拆箱) i.intValue() + 5;
        // 加法运算完成后，再次装箱，把基本数值转成对象。

    }
}
