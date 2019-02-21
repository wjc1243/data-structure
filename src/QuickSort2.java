import java.util.Arrays;

public class QuickSort2 {
    public static void main(String[] args) {
        int[] arr = {1,6,99,55,51,47,2,5,6,-1
                ,77,45,68,92,982,99,15,22};
        System.out.println(Arrays.toString(arr));
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr) {
        int low = 0, high = arr.length-1;
        quickSort(arr, low, high);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low < high){
            int index = part(arr, low, high);
            quickSort(arr, low, index-1);
            quickSort(arr, index+1, high);
        }
    }

    private static int part(int[] arr, int low, int high) {
        int cur = arr[low];
        while (low < high){
            while (low < high && arr[high] >= cur){
                high--;
            }
            if(low < high) {
                arr[low] = arr[high];
                low++;
            }
            while (low < high && arr[low] <= cur){
                low++;
            }
            if(low < high) {
                arr[high] = arr[low];
                high--;
            }
        }
        arr[low] = cur;
        return low;
    }
}
