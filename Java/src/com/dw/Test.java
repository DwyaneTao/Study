package com.dw;

import java.util.Arrays;
import java.util.Random;

/**
 * 数据结构和算法
 */
public class Test {

    public static void main(String[] args) {

        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(1000);
        }
        System.out.println(Arrays.toString(arr));
        int[] newArr = toTest(arr);
        System.out.println(Arrays.toString(newArr));
    }

    /**
     *
     * 冒泡排序算法
     * 说明：两两比较，大数在后 第一轮  可以得到最大一个数
     * @param arr
     * @return
     */
    public static int[]  toTest(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    temp = arr[j] ;
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    /**
     * 选择排序
     *
     */

}
