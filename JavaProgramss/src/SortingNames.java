import java.util.*;
public class SortingNames {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String temp = "";
        int n;
        System.out.println("Enter the range");
        n = in.nextInt();
        String[] Names = new String[n];
        for(int i = 0 ; i < n ; i++){
            System.out.println("Enter Names"+"["+(i+1)+"]");
            Names[i] = in.next();
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n - 1; j++){
                if(Names[j].compareTo(Names[i]) > 0 ){
                    temp = Names[j];
                    Names[j] = Names[i];
                    Names[i] = temp;
                }
            }
        }
        System.out.println("Sorted Names:");
        for(int i = 0 ; i < n ; i++){
            System.out.println(Names[i]);
        }
    }
}
