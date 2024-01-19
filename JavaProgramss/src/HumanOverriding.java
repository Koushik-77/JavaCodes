class Human{
    void speak(){
        System.out.println("Human is Speaking");
    }
}
class Employee extends Human{
    void speak(){
        System.out.println("Employee is Speaking");
    }
    void work(){
        System.out.println("Employee is Working");
    }
}
class Student extends Human{
    void speak(){
        System.out.println("Student is speaking");
    }
    void study(){
        System.out.println("Student is Studying");
    }
}
public class HumanOverriding{
    public static void main(String[] args) {
        Human Person1 = new Employee();
        Human Person2 = new Student();
        Person1.speak();
        Person2.speak();
    }
}