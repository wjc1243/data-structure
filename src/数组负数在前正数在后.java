import java.util.Arrays;

public class 数组负数在前正数在后 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 67, 1, -3, 2, 9, -2, -6, -9, 22, 12, -8};
        System.out.println(Arrays.toString(arr));
        helper(arr);
        System.out.println(Arrays.toString(arr));
    }

    //相对位置改变
    private static void helper(int[] arr){
        int l = 0, r = arr.length-1, temp = 0;
        while (l < r){
            if(arr[l] < 0){
                l++;
                continue;
            }
            if(arr[r] > 0){
                r--;
                continue;
            }
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }
    }
}
