import java.io.*;
import java.util.*;

public class Java_Strings_Introduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        System.out.println(A.length()+B.length());
        
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        // boolean result = A.compareTo(B)>0;
        // if(result){
        //     System.out.println("yes");
        // }
        // else{
        //     System.out.println("No");
        // }
        
        String result1 = A.substring(0,1).toUpperCase()+A.substring(1);
        String result2 = B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(result1+" "+result2);
        
    }
}



