class Human{
    private int age = 11;
    private String name = "ankit";

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
public class Encapsulation{
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(30);
        obj.setName("Ankit");
        System.out.println(obj.getName() + ":" + obj.getAge());
    }
}