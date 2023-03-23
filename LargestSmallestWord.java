import java.util.Scanner;
public class LargestSmallestWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a string");
        String text = s.nextLine();
        String[] textArray = text.split(" ");

        int wordLengthLarge = 0, wordLengthSmall = 45;
        String largest = "", smallest = "";

        for(String word : textArray){
            if(word.length() > wordLengthLarge){
                wordLengthLarge = word.length();
                largest = word;
            }
            if(word.length() <= wordLengthSmall){
                wordLengthSmall = word.length();
                smallest = word;
            }
        }
        System.out.println("largest word is: " + largest);
        System.out.println("smallest word is: " + smallest);
        s.close();
    }
}
