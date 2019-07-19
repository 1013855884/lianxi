import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShuZu {
    public static void main(String[] args) {
        //数组排序求和，最大值，最小值，平均值
//        int [] arr = new int[5];
//        Random random = new Random();
//        int sum = 0 ;
//        for (int i = 0; i < 5; i++) {
//            arr[i] = random.nextInt();
//            System.out.print(arr[i]+"\t");
//            sum = sum + arr[i];
//        }
//
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println("最大值"+arr[4]);
//        System.out.println("最小值"+arr[0]);
//        System.out.println("总和"+sum+"平均值"+sum/5);


        ///       冒泡排序

//        int [] arr = {12,45,13,14,58};
//        int tem = 0;
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = arr.length-1; j >i; j--) {
//                if(arr[j]<arr[j-1]){
//                    tem = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = tem;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
        int [] [] arr = new int[2][3];
        arr[0][0] = 0;
        arr[0][1] = 0;
        arr[0][2] = 0;
        arr[1][0] = 0;
        arr[1][1] = 0;
        arr[1][2] = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length+1; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
