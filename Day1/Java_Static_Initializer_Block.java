import java.io.*;
import java.util.*;

public class Java_Static_Initializer_Block {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        
        if(l>0 && b>0){
            System.out.println(l*b);
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
