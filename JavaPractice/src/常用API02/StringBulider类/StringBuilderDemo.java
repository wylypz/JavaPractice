package ����API02.StringBulider��;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        System.out.println(sb1);


        StringBuilder sb2=new StringBuilder("123");
        System.out.println(sb2);

        //public StringBuilder append(��������)
        StringBuilder builder2 = sb2.append("hello");
        System.out.println(sb2== builder2);
        builder2.append("hello").append("world").append(true).append(100);
        System.out.println("builder2:" + builder2);

        StringBuilder sb3 = sb2.reverse();

        System.out.println(sb3);         // 321
        System.out.println(sb3 == sb2);  // true

        String str = builder2.toString();
        System.out.println(str);
    }
}
