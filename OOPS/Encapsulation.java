class Human{
    private int age = 11;
    private String name = "ankit";

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
public class Encapsulation{
    public static void main(String[] args) {
        Human obj = new Human();
        // obj.age = 30;
        // obj.name = "Ankit";
        System.out.println(obj.getName() + ":" + obj.getAge());
    }
}