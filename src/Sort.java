import java.util.Arrays;

/**
 * create by wjc
 */
public class Sort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,5,6,7,87,9,0,1,3,4,6,8,9,2};
        //noBubbleSort(arr);
        //bubbleSort(arr);
        //insertSort(arr);
        //selectSort(arr);
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr){
        int l = 0, r = arr.length-1;
        quickSort(arr, l, r);
    }

    private static void quickSort(int[] arr, int l, int r) {
        if(l < r){
            int index = part(arr, l, r);
            quickSort(arr, l, index-1);
            quickSort(arr, index+1, r);
        }
    }

    private static int part(int[] arr, int l, int r) {
        int cur = arr[l];
        while (l < r){
            while (l < r && arr[r] >= cur){
                r--;
            }
            if(l < r){
                arr[l] = arr[r];
                l++;
            }
            while (l < r && arr[l] <= cur){
                l++;
            }
            if(l < r){
                arr[r] = arr[l];
                r--;
            }
        }
        arr[l] = cur;
        return l;
    }

    /**
     * 选择排序
     * @param arr
     */
    private static void selectSort(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int min = arr[i], pos = i;
            for (int j = i+1; j < len; j++) {
                if(arr[j] < min){
                    min = arr[j];
                    pos = j;
                }
            }
            arr[pos] = arr[i];
            arr[i] = min;
        }
    }

    /**
     * 插入排序
     * @param arr
     */
    private static void insertSort(int[] arr){
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int insertNum = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > insertNum){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = insertNum;
        }
    }

    /**
     * 假的冒泡排序
     * @param arr
     */
    private static void noBubbleSort(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     * 真的冒泡排序
     * @param arr
     */
    private static void bubbleSort(int[] arr){
        int len = arr.length, temp = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
