/*
A java program to implement quicksort in ascending order with command line argument array input
Usage: java cmdQwikSort <array_length> <space_separated_array>
 */
import java.lang.System;

public class cmdQwikSort {
    private static int partition(int[] arr, int s, int e) {
        int pivot = arr[e];
        int partindex = s;
        for (int i = s; i < e; i++) {
            if (arr[i] <= pivot) {
                //swap
                int temp = arr[i];
                arr[i] = arr[partindex];
                arr[partindex] = temp;
                partindex += 1;
            }
        }
        //swap pivot
        int temp = arr[partindex];
        arr[partindex] = arr[e];
        arr[e] = temp;

        return partindex;
    }

    private static void qsort(int[] arr, int s, int e) {
        if (s < e) {
            int pindex = partition(arr, s, e);
            qsort(arr, s, pindex - 1);
            qsort(arr, pindex + 1, e);
        }
    }
    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Usage: java cmdQwikSort <array_length> <space_separated_array>");
            System.exit(0);
        }
        int len = Integer.parseInt(args[0]);
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(args[i + 1]);
        }
        System.out.println("The un-sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        qsort(arr, 0, len - 1);

        System.out.println("The sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}