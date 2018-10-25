import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1,34,67,90,388,56,37,89,34,7,23,76,9,21,-1};
        System.out.println(Arrays.toString(arr));
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        quickSort(arr, l, r);
    }

    private static void quickSort(int[] arr, int l, int r) {
        if(l < r) {
            //分区
            int index = part(arr, l, r);
            //排左边
            quickSort(arr, l, index - 1);
            //排右边
            quickSort(arr, index + 1, r);
        }
    }

    private static int part(int[] arr, int l, int r) {
        int temp = arr[l];
        while (l < r){
            while (l < r && arr[r] >= temp){
                r--;
            }
            if(arr[r] < temp){
                arr[l] = arr[r];
                l++;
            }
            while (l < r && arr[l] <= temp){
                l++;
            }
            if(arr[l] > temp){
                arr[r] = arr[l];
                r--;
            }
        }
        arr[l] = temp;
        return l;
    }
}
