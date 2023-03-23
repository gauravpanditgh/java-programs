import java.util.Scanner;
public class The {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a string");
        String text = s.nextLine();
        String[] stringArray = text.split(" ");

        int count=0;
        for(String word : stringArray){
            if(word.equals("The") || word.equals("the")){
                count++;
            }
        }
        System.out.println(count);
        s.close();
    }
}
