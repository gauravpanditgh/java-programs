import java.util.Scanner;
import java.util.ArrayList;
class EvenNumsDelete{
    public static ArrayList<Integer> processArray(ArrayList<Integer> nums){
        boolean flag = false;
        for(int i=0; i<nums.size(); i++){
            if(nums.get(i) % 2 == 0 && flag == true){
                nums.set(i, -1);
            }
            if(nums.get(i) % 2 == 0){
                flag = true;
            }
            if(nums.get(i) % 2 != 0 && nums.get(i) > -1){
                flag = false;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int num;
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        while(true){
            num = s.nextInt();
            if(num == -1){
                break;
            }
            nums.add(num);
        }
        s.close();
        nums = processArray(nums);
        for(Integer i : nums){
            if(i > -1){
                System.out.println(i);
            }
        }
    }
}
