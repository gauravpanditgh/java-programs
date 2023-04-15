import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        HashSet<String> large = new HashSet<>();
        HashSet<String> small = new HashSet<>();
        Scanner s = new Scanner(System.in);
        System.out.println("enter a string");
        String text = s.nextLine();
        String[] textArray = text.split(" ");

        int wordLengthLarge = 0, wordLengthSmall = 45;

        for(String word : textArray){
            if(word.length() > wordLengthLarge){
                wordLengthLarge = word.length();
            }
            if(word.length() <= wordLengthSmall){
                wordLengthSmall = word.length();
            }
        }
        
        for(String word : textArray){
            if(word.length() == wordLengthSmall)
            small.add(word);
        }
        
        for(String word : textArray){
            if(word.length() == wordLengthLarge)
            large.add(word);
        }
        
        System.out.println(small);
        System.out.println(large);

        s.close();
    }
}
