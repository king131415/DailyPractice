package javaDailyProctice.Test0608;

import java.util.Arrays;

public class Test0608_2 {
    public static void Shellsort(int[] arr){
        int len = arr.length;
        int temp, gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = arr[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && arr[preIndex] > temp) {
                    arr[preIndex + gap] = arr[preIndex];
                    preIndex -= gap;
                }
                arr[preIndex + gap] = temp;
            }
            gap /= 2;
        }

    }
    public static void main(String[] args) {
        int[] arr={2,5,7,4,22,10};
        Shellsort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
