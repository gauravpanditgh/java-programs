import java.util.Arrays;
public class NthLargestNumber {

    public static void biggest(int[] arr, int nth){
        Arrays.sort(arr);
        System.out.println(nth + "th largest number is " + arr[arr.length-nth]);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,100};
        int nth = 3;
        biggest(arr, nth);
    }
}
