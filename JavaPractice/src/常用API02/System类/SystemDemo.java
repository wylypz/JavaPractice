package 常用API02.System类;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class SystemDemo {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        Date date = new Date(currentTime);

        // 获取日历类
        Calendar calendar = Calendar.getInstance();

        // 设置毫秒值
        calendar.setTimeInMillis(currentTime);

        System.out.println(date);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        int[] src = new int[]{1, 2, 3, 4, 5};
        int[] dest = new int[]{11, 22, 33, 44, 55};

        System.arraycopy(src, 0, dest, 0, 3);

        /*
            代码运行后：两个数组中的元素发生了变化
                src数组元素[1,2,3,4,5]
                dest数组元素[1,2,3,44,55]
        */

        // 使用字符串形式打印数组
        System.out.println(Arrays.toString(src));           // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(dest));          // [1, 2, 3, 44, 55]


    }
}
