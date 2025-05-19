import java.util.*;
import java.io.*;

class Java_Loops_II{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum=0;
            for (int x=0;x<=n-1;x++){
                sum = sum+(int)(Math.pow(2,x)*b);
                System.out.print(a+sum+" "); 
            }
            System.out.println();
        }
        in.close();
    }
}
