package 反射;

public class Demo01 {
    public static void main(String[] args) {
        // 通过全类目的方式获取字节码对象
        Class<Cate> cateClass = (Class<Cate>) Class.forName("反射.Cate");
        // 获取简单类名
        System.out.println(cateClass.getSimpleName());
        // 获取字节码对象的全类名
        System.out.println(cateClass.getName());


    }
}
