interface printable{
    public void print();
}
interface showable{
    public void show();
}
class MultipleInheritance implements printable,showable{

    public void print() {
        System.out.print("Hello ");
    }

    public void show() {
        System.out.println("Welcome!");
    }

    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.print();
        obj.show();
    }
}
