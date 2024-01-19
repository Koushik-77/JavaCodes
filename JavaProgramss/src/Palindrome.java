import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = in.next();
        String temp = str;
        String rev = "";
        for(int i = str.length() - 1 ; i >= 0;i--){
            rev += str.charAt(i);
        }
        if(temp.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
