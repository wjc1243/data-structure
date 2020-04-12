public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
        System.out.println(fibonacci2(6));
    }

    //递归
    private static int fibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    //迭代
    private static int fibonacci2(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        int res = 0, _1val = 1, _2val = 1;
        while (n > 2){
            res = _1val + _2val;
            _2val = _1val;
            _1val = res;
            n--;
        }
        return res;
    }
}
