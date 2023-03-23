public class Person {
    private String name;
    private int id;
    private static int idGenerator;

    public Person(String name){
        this.name = name;
        id = ++idGenerator;
    }

    public String toString(){
        return "name: " + name + " \nid: " + id;
    }
}
