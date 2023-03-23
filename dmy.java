import java.util.Scanner;
class dmy{
    public static void printDate(int dd, int mm, int yyyy){
        if(mm==1){
            if(dd==1){
                dd = 31;
                mm = 12;
                yyyy--;
            }
            else{
                dd--;
            }   
        }
        else if(mm==3){
            if(dd==1){
                if(yyyy%4 == 0){
                    if(yyyy%100 == 0){
                        if(yyyy%400 == 0){
                            dd = 29;
                            mm--; 
                        }
                    }
                }
                else{
                    dd = 28;
                    mm--;
                }
            }
            else{
                dd--;
            }   
        }
        else if(mm==5 || mm==7 || mm==8 || mm==10 || mm==12){
            if(dd==1){
                dd=30;
                mm--;
            }
            else{
                dd--;
            } 
        }
        else if(mm==2 || mm==4 || mm==6 || mm==9 || mm==11){
            if(dd==1){
                dd=31;
                mm--;
            }
            else{
                dd--;
            }
        }
        else{
            return;
        }

        System.out.println("previous date: " + dd + "/" + mm + "/" + yyyy);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter date, month and year:");
        printDate(s.nextInt(), s.nextInt(), s.nextInt());
        s.close();
    }
}
