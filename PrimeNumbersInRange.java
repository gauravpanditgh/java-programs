import java.util.Scanner;
public class PrimeNumbersInRange
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.print("enter lower limit: ");
	    int low = s.nextInt();
	    System.out.print("enter upper limit: ");
	    int high = s.nextInt();
	    boolean flag = true;
	    
	    for(int i=low; i<=high; i++){
	        for(int j=2; j<=i/2; j++){
	            if(i%j == 0){
	                flag = false;
					break;
	            }
	        }
	        if(flag){
	            System.out.print(i + "  ");
	        }
	        flag = true;
	    }
		s.close();
	}
}