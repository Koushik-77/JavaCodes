import java.util.*;
public class MultipleCatchBlocks {
    public static void main(String[] args) {
        int a = 7 ;
        int b = 0;
        try{
            System.out.println(a/b);
        }catch (ArithmeticException ex){
            System.out.println("It is an "+ex);
        }catch (NumberFormatException ex){
            System.out.println("It is an "+ex);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("It is an "+ex);
        }finally {
            System.out.println("Exception Handling Completed");
        }
    }
}
