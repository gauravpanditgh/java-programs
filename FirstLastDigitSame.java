import java.util.Scanner;
public class FirstLastDigitSame{

    public static void digits(int a, int b){
        for(int i=a; i<=b; i++){
            String str = Integer.toString(i);
            if(str.length()>1){
                if(str.charAt(0) == str.charAt(str.length()-1)){
                    System.out.println(str);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b= s.nextInt();
        s.close();
        digits(a, b);
    }
}
