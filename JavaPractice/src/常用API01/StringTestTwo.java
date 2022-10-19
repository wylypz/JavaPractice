package 常用API01;

public class StringTestTwo {
    public static void main(String[] args) {
        String str = "Hello World";
        // public int length () ：返回此字符串的长度。
        System.out.println(str.length());           // 10
        System.out.println("---------------");

        // public String concat (String str) ：将指定的字符串连接到该字符串的末尾。
        String str2 = str.concat("_Java");
        System.out.println(str2);                   // HelloWorld_Java
        System.out.println("---------------");

        // public char charAt (int index) ：返回指定索引处的 char值。
        char c1 = str2.charAt(0);
        char c2 = str2.charAt(1);
        System.out.println(c1);                     // H
        System.out.println(c2);                     // e
        System.out.println("---------------");

        // public int indexOf (String str) ：返回指定子字符串第一次出现在该字符串内的索引。
        int a = str.indexOf("o");                   // 4
        int b = str.indexOf("l");                   // 2
        int c = str.indexOf("ll");                  // 2
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("---------------");
        // public char[] toCharArray () ：将此字符串转换为新的字符数组。
        char[] chars = str.toCharArray();       // a,b,c
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + ",");
        }
        System.out.println("\n-------------");

        // public byte[] getBytes ()：使用平台的默认字符集将该 String编码转换为新的字节数组。
        byte[] bytes = str.getBytes();          // 97,98,99
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + ",");
        }
        System.out.println("\n-------------");

        // public String toLowerCase() ：使用默认语言环境的规则将此 String所有字符转换为小写。
        String lowerCase = str.toLowerCase();
        System.out.println(lowerCase);          // abc
        System.out.println("-------------");

        // public String toUpperCase() ：将此 String所有字符转换为大写，使用默认语言环境的规则。
        String upperCase = str.toUpperCase();
        System.out.println(upperCase);          // ABC
        System.out.println("-------------");

        // public String replace (CharSequence target, CharSequence replacement) ：将与target匹配的字符串使用replacement字符串替换。
        String str3 = str2.replace("l", "L");
        System.out.println(str2);   //注意，replace会返回一个新的字符串，新字符串才是被替换后的。这里输出HelloWorld
        System.out.println(str3);   //HeLLoWorLd

        String sub1 = str.substring(5);
        System.out.println(sub1);
        System.out.println("---------------");

        /*
            public String substring (int beginIndex, int endIndex) ：返回一个子字符串，从beginIndex到
            endIndex截取字符串。含beginIndex，不含endIndex。
        */
        String sub2 = str.substring(2, 4);
        System.out.println(sub2);
        System.out.println("---------------");


        String word = "大家好,我叫小灰,今年20岁";
        String[] words = word.split(","); //["大家好","我叫小灰","今年20岁"]
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        String s1 = "abc";
        String s2 = "abc";
        String s3 = "ab" + "c";
        String s4 = "ab" + new String("c");
        String s5 = new String("abc");
        String s6 = "a";
        String s7 = "bc";
        String s8 = s6 + s7;

        System.out.println(s1 == s2);       // true(都存储在常量池)
        System.out.println(s1 == s3);       // true(常量相加,生成的值也是在常量池,保留常量池中的引用)
        System.out.println(s1 == s4);       // false(只要是和变量相加,都会new出一份新的)
        System.out.println(s1 == s8);       // false(只要是和变量相加,都会new出一份新的)
        System.out.println(s4 == s5);       // false

        String s9 = "1" + new String("1");

        // 查看常量池是否有"11"这个字符串,如果没有,则将"11"存入常量池,并返回常量池的地址
        String s10 = s9.intern();

        String s11 = "11";
        System.out.println(s10 == s11);			// true

    }
}
