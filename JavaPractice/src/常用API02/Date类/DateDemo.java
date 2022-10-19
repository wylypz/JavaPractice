package 常用API02.Date类;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        // 创建日期对象，把当前的时间转成日期对象
        System.out.println(new Date());
        // 创建日期对象，把当前的毫秒值转成日期对象
        System.out.println(new Date(0L));

        Date date = new Date();

        // 返回1900到现在的年份  如:2021 -> 121; 2020 -> 120
        System.out.println(date.getYear());

        // 返回月份  0-11  0代表1月,1代表2月...
        System.out.println(date.getMonth());

        // 返回当月的第几天
        System.out.println(date.getDate());

        // 小时
        System.out.println(date.getHours());

        // 分钟
        System.out.println(date.getMinutes());

        // 秒
        System.out.println(date.getSeconds());

        // 星期几
        System.out.println(date.getDay());

    }
}
