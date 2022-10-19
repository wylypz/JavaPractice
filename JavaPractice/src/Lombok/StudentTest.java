package Lombok;

import Lombok.StudentLombok;

import java.util.HashMap;

public class StudentTest {
    public static void main(String[] args) {
        // 提供了有参和无参构造
        StudentLombok s1  = new StudentLombok("小灰",20);
        StudentLombok s2  = new StudentLombok();

        // 提供了get/set
        s2.setName("小灰");
        s2.setAge(20);
    HashMap map = new HashMap<>();
        map.put(s1,1);
        map.put(s2,1);

        System.out.println(map.size());     // 1(提供了hashCode和equals)

        System.out.println(s2);         // 提供了toString

        s1.eat("apple");

}}
