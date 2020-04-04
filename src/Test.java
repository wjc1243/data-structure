import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str = "a bc defg ghi j k l mn op q";
        String[] arr = str.split(" ");
        int maxLen = 0;
        for(String s: arr){
            maxLen = Math.max(s.length(), maxLen);
        }
        System.out.println(maxLen);

        /*------------------------*/

        int curLen = 0, maxLen2 = 0;
        char[] sc = str.toCharArray();
        for(char c: sc){
            //空格ASCII码为32
            if(c == 32){
                maxLen2 = Math.max(curLen, maxLen2);
                curLen = 0;
            }else {
                curLen++;
            }
        }
        System.out.println(maxLen2);

        /*------------------------*/

        int curLen2 = 0, maxLen3 = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 32){
                maxLen3 = Math.max(curLen2, maxLen3);
                curLen2 = 0;
            }else {
                curLen2++;
            }
        }
        System.out.println(maxLen3);
    }
}
