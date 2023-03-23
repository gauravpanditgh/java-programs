import java.util.Scanner;
import java.util.HashSet;

class PossibleTimeCombos{
    public static void time(int a, int b, int c, int d){
        HashSet<String> set = new HashSet<>();
        int[] arr = {a, b, c, d};
        for(int i=0; i<4; i++){
            int h1 = arr[i];
            for(int j=0; j<4; j++){
                int h2 = arr[j];
                for(int k=0; k<4; k++){
                    int m1 = arr[k];
                    for(int l=0; l<4; l++){
                        int m2 = arr[l];
                        if(((h1<2 && h2<10) || (h1==2 && h2<4)) && m1<6 && m2<10){
                            if(i==j || i==k || i==l || j==k || j==l || k==l){
                                continue;
                            }
                            else{
                                set.add(h1 + "" + h2 + ":" + m1 + "" + m2);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(set);
        System.out.println("total possible time combinations = " + set.size());
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        time(s.nextInt(), s.nextInt(), s.nextInt(),s.nextInt());
        s.close();
    }    
}
