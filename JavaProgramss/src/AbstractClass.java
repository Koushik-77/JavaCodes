abstract class Shape{
    int n = 10 , m = 100;
    abstract void Area();
}
class Triangle extends Shape{
    void Area(){
        int x = (int)((0.5)*n*m);
        System.out.println("Area of Triangle is :"+x);
    }
}
class Rectangle extends Shape{
    void Area(){
        int x = n*m;
        System.out.println("Area of Rectangle is :"+x);
    }
}
class Circle extends Shape{
    void Area(){
        int x = (int) (3.14*n*n);
        System.out.println("Area of Circle is :"+x);
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Triangle tri = new Triangle();
        tri.Area();
        Rectangle rec = new Rectangle();
        rec.Area();
        Circle cir = new Circle();
        cir.Area();
    }
}
