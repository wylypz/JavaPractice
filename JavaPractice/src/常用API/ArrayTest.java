package 常用API;

import org.testng.annotations.Test;

import java.util.Arrays;
public class ArrayTest {
    public static void main(String[] args) {
        int[] arr1 = {32, 132, 19, 28, 17, 54};
        int[] arr2 = {32, 132, 19, 28, 17, 54};

        // 比较两个数组里面的元素是否相同
        System.out.println(Arrays.equals(arr1, arr2));// true
        ArrayTest.test3();
    }

    public static void test6() {
        int[] arr = {32, 132, 19, 28, 17, 54};

        // 从0(包含)下标开始拷贝到4下标(不包含),将中间的元素放入新数组,并将新的数组返回
        int[] newArr_1 = Arrays.copyOfRange(arr, 0, 4);

        // 从2(包含)下标开始拷贝到4下标(不包含),将中间的元素放入新数组,并将新的数组返回
        int[] newArr_2 = Arrays.copyOfRange(arr, 2, 4);

        System.out.println(Arrays.toString(arr));           // [32, 132, 19, 28, 17, 54]
        System.out.println(Arrays.toString(newArr_1));      // [32, 132, 19, 28]
        System.out.println(Arrays.toString(newArr_2));      // [19, 28]
    }

    public static void test5() {
        int[] arr = {32, 132, 19};

        // 拷贝arr数组的0下标开始拷贝2个元素到新的数组,并将新数组返回
        int[] newArr = Arrays.copyOf(arr, 2);

        System.out.println(Arrays.toString(newArr));            // [32, 132]
    }

    public static void test4() {
        int[] arr = {32, 132, 19, 28, 17, 54};

        // 搜索前必须先排序
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));           // [17, 19, 28, 32, 54, 132]

        // 在数组中搜索54
        int index = Arrays.binarySearch(arr, 54);       // 4
        System.out.println(index);

        int index2 = Arrays.binarySearch(arr, 35);      // 35插入的索引是:4, 最终查询到的索引位置是: (-4-1)=-5
        System.out.println(index2);                         // -5

        int index3 = Arrays.binarySearch(arr, 18);      // 18插入的索引是:1, 最终查询到的索引位置是: (-1-1)=-2
        System.out.println(index3);                         // -5
    }

    public static void test3() {
        int[] arr = {32, 132, 19, 28, 17, 54};
        System.out.println(Arrays.toString(arr));           // [32, 132, 19, 28, 17, 54]

        // 数组排序,排序0~3(不含)索引的元素
        Arrays.sort(arr, 0, 3);
        System.out.println(Arrays.toString(arr));           // [19, 32, 132, 28, 17, 54]
    }
    public static void test2() {
        int[] arr = {32, 132, 19, 28, 17, 54};
        System.out.println(Arrays.toString(arr));           // [32, 132, 19, 28, 17, 54]

        // 数组排序(默认为升序排序)
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));           // [17, 19, 28, 32, 54, 132]
    }
    @Test
    public static void test() {
        int[] arr = {32, 132, 19, 28, 17, 54};

        String arrStr = Arrays.toString(arr);

        System.out.println(arrStr);    // 数组的字符串表示形式[32, 132, 19, 28, 17, 54]
    }



}

