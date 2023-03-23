import java.util.Scanner;
import java.util.ArrayList;
class FirstCentury{
    
    public static void processArray(ArrayList<Integer> nums){
        boolean flag = false;
        for(int i=0; i<nums.size(); i++){
            if(nums.get(i) > 99 && flag==true){
                //nums.remove(i);
                nums.set(i, -1);
            }
            if(nums.get(i) > 99){
                flag = true;
            }
            if(nums.get(i) > 0 && nums.get(i) < 100){
                flag = false;
            }
        }
        for(Integer i : nums){
            if(i>=0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int num;
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        while(true){
            num = s.nextInt();
            if(num<0){
                break;
            }
            nums.add(num);
        }
        s.close();
        processArray(nums);
    }
}
