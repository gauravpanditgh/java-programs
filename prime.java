public class prime {
    public static void primeNum(int[] arr) {
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            for (int j = 2; j < num / 2; j++) {
                if (num == 0 || num == 1) {
                    System.out.println(num + " - not prime");
                    break;
                }
                if (num % j == 0) {
                    flag = false;
                    System.out.println(num + " - not prime");
                    break;
                }
            }
            if (flag) {
                System.out.println(num + " - prime");
            } 
            else {
                flag = true;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 3, 5, 10, 12, 17, 20 };
        primeNum(arr);
    }
}
