import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();
        
        int[] count=new int[26];
        
        if(a.length() != b.length()){
            System.out.println("Not Anagrams");
            return;
        }
        
        for(int i=0; i<a.length();i++){
                count[a.charAt(i)-'a']++;
                count[b.charAt(i)-'a']--;
        }
        for(int c : count){
           if(c !=0){
                System.out.println("Not Anagrams");
                return;
           } 
        }
           System.out.println("Anagrams");        
    }
}
