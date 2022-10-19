package 常用API01;

public class StringTest {
    public static void main(String[] args) {
        //1.String() 创建一个空的字符串对象
        String str1 = new String();
        System.out.println("str1: " + str1);        // 空字符

        // 2.String(String original) 根据字符串来创建一个字符串对象
        String str2 = new String("abc");
        System.out.println(str2);               // abc

        // 3.String(char[] value) 通过字符数组来创建字符串对象
        char[] chs = {'A', 'B', 'C', 'D', 'E'};
        String str3 = new String(chs);
        System.out.println(str3);           // ABCDE

        // 4.String(byte[] bytes) 通过字节数组来构造新的字符串对象
        byte[] bytes = {97, 98, 99, 100, 101};
        String str4 = new String(bytes);
        System.out.println(str4);            // abcde

        // 5.String(byte[] bytes, int offset, int length) 通过字节数组一部分来构造新的字符串对象
        String str5 = new String(bytes, 1, 2);
        System.out.println(str5);           // bc

        //创建字符串对象
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "Hello";

        //  boolean equals(Object anObject) 将此字符串与指定对象进行比较。
        System.out.println(s1.equals(s2));      //true
        System.out.println(s1.equals(s3));      //false
        System.out.println("----------------");

        //  boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2));        //true
        System.out.println(s1.equalsIgnoreCase(s3));        //true
        System.out.println("----------------");

    }
}
