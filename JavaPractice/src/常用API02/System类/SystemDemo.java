package ����API02.System��;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class SystemDemo {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        Date date = new Date(currentTime);

        // ��ȡ������
        Calendar calendar = Calendar.getInstance();

        // ���ú���ֵ
        calendar.setTimeInMillis(currentTime);

        System.out.println(date);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        int[] src = new int[]{1, 2, 3, 4, 5};
        int[] dest = new int[]{11, 22, 33, 44, 55};

        System.arraycopy(src, 0, dest, 0, 3);

        /*
            �������к����������е�Ԫ�ط����˱仯
                src����Ԫ��[1,2,3,4,5]
                dest����Ԫ��[1,2,3,44,55]
        */

        // ʹ���ַ�����ʽ��ӡ����
        System.out.println(Arrays.toString(src));           // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(dest));          // [1, 2, 3, 44, 55]


    }
}
