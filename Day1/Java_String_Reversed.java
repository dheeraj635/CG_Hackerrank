import java.io.*;
import java.util.*;

public class Java_String_Reversed {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder s = new StringBuilder(A);
        s = s.reverse();
        String str = s.toString();
        if (A.equals(str)){
            System.out.println("Yes");          
        }
        else{
            System.out.println("No");
        }
    }
}



