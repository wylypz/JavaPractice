package ����API02.Date��;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormatDemo {
    public static void main(String[] args) {
        System.out.println("������������� ��ʽ YYYY-MM-dd");
        // ��ȡ��������,��������

                Scanner sc= new Scanner(System.in);
        String birthdayString = sc.next();

        // ���ַ�������,ת��Date����
        // ����SimpleDateFormat����,д����ģʽ
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayString);

        Date todayDate=new Date();
        // ����������ת�ɺ���ֵ,Date��ķ���getTime
        long birthdaySecond = birthdayDate.getTime();
        long todaySecond = todayDate.getTime();
        long liveSecond = todaySecond - birthdaySecond;
        if (liveSecond < 0) {
            System.out.println("��û������");
        } else {
            System.out.println("������: " + (liveSecond / 1000 / 60 / 60 / 24) + "��");
        }
    }




        }
    }

