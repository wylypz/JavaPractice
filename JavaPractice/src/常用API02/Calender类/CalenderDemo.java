package 常用API02.Calender类;

import java.util.Calendar;

public class CalenderDemo {
    public static void main(String[] args) {
        // 获取日历对象
        Calendar calendar = Calendar.getInstance();
        System.out.println("年： " + calendar.get(Calendar.YEAR));
        System.out.println("月： " + calendar.get(Calendar.MONTH));       // 0-11,4代表5月,5代表6月
        System.out.println("日： " + calendar.get(Calendar.DAY_OF_MONTH));  // 0-6,0代表星期六,1代表星期天
        System.out.println("星期几： " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("一个月第几周： " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("时： " + calendar.get(Calendar.HOUR));
        System.out.println("分： " + calendar.get(Calendar.MINUTE));
        System.out.println("秒： " + calendar.get(Calendar.SECOND));

    }
}
