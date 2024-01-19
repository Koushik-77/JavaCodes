public class MethodOverLoading {
    void callvalue(){
        int x;
        x = 7;
        x*=x;
        System.out.println("Square of x is :"+x);
    }
    void callvalue(int y){
        y = y*y*y;
        System.out.println("Cube of y is : "+y);
    }
    void callvalue(int n,int m){
        int z = n*m;
        System.out.println("Product of n and m is :"+z);
    }
    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();
        obj.callvalue();
        obj.callvalue(7);
        obj.callvalue(10,20);
    }
}
