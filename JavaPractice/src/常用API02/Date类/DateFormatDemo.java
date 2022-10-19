package 常用API02.Date类;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormatDemo {
    public static void main(String[] args) {
        System.out.println("请输入出生日期 格式 YYYY-MM-dd");
        // 获取出生日期,键盘输入

                Scanner sc= new Scanner(System.in);
        String birthdayString = sc.next();

        // 将字符串日期,转成Date对象
        // 创建SimpleDateFormat对象,写日期模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayString);

        Date todayDate=new Date();
        // 将两个日期转成毫秒值,Date类的方法getTime
        long birthdaySecond = birthdayDate.getTime();
        long todaySecond = todayDate.getTime();
        long liveSecond = todaySecond - birthdaySecond;
        if (liveSecond < 0) {
            System.out.println("还没出生呢");
        } else {
            System.out.println("您活了: " + (liveSecond / 1000 / 60 / 60 / 24) + "天");
        }
    }




        }
    }

