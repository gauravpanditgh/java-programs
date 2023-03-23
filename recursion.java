class recursion{
    public static void factorial(int num, int sum){
        if(num == 1){
            System.out.println(sum);
            return;
        }
        sum *= num;
        factorial(num-1, sum);
    }
    public static void main(String[] args){
        factorial(5, 1);
    }
}
