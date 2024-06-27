import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter number of foods: ");
        Food[] foods = new Food[s.nextInt()];

        for(int i=0; i<foods.length; i++){
            System.out.println("enter food name, cusine");
            foods[i] = new Food(s.nextLine(), s.nextLine());
        }

        for(Food f : foods){
            System.out.println(f.toString(f) + "\n");
        }
    }
}
