package ����;

public class Demo01 {
    public static void main(String[] args) {
        // ͨ��ȫ��Ŀ�ķ�ʽ��ȡ�ֽ������
        Class<Cate> cateClass = (Class<Cate>) Class.forName("����.Cate");
        // ��ȡ������
        System.out.println(cateClass.getSimpleName());
        // ��ȡ�ֽ�������ȫ����
        System.out.println(cateClass.getName());


    }
}
