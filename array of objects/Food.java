public class Food {
    private String name, cusine;
    private int srno;
    private static int srnoCounter = 0;

    public Food(String name, String cusine){
        this.name = name;
        this.cusine = cusine;
        this.srno = ++srnoCounter;
    }

    public String toString(Food f){
        return "\n" + "Name: " + name + "\n" + "Cusine: " + cusine +  "\n" + "SrNo: " + srno +  "\n" + "ID: " + f;
    }
}
