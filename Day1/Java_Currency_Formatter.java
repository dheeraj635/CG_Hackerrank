import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_Currency_Formatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        // Write your code here.
        Locale indiaLocale = new Locale("en","IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment).replace(" ", ""));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
