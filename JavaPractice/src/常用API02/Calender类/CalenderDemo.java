package ����API02.Calender��;

import java.util.Calendar;

public class CalenderDemo {
    public static void main(String[] args) {
        // ��ȡ��������
        Calendar calendar = Calendar.getInstance();
        System.out.println("�꣺ " + calendar.get(Calendar.YEAR));
        System.out.println("�£� " + calendar.get(Calendar.MONTH));       // 0-11,4����5��,5����6��
        System.out.println("�գ� " + calendar.get(Calendar.DAY_OF_MONTH));  // 0-6,0����������,1����������
        System.out.println("���ڼ��� " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("һ���µڼ��ܣ� " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("ʱ�� " + calendar.get(Calendar.HOUR));
        System.out.println("�֣� " + calendar.get(Calendar.MINUTE));
        System.out.println("�룺 " + calendar.get(Calendar.SECOND));

    }
}
