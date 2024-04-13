
package javaapplication4;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Lab03second_version {
    
    public static void main (String[]args){
       // Scanner object to get User input
        Scanner input = new Scanner(System.in);

        // format to 2 decimal places
        DecimalFormat twoDigit = new DecimalFormat("#,##0.00");

        // retrieve the amount to be paid
        System.out.print("Enter the amount to be paid: ");
        String stringValue = twoDigit.format(input.nextDouble());

        // Get the double (total)
        double number = Double.parseDouble(stringValue);
        int whole = Integer.parseInt(stringValue.split("\\.")[0]);
        int fractional = Integer.parseInt(stringValue.split("\\.")[1]);

        // Display the answer
        System.out.println("$" + number + " can be split into the following:");
        
        //Dollar bills
        System.out.println(whole+" dollars in bills:");
        System.out.println(" "+whole /20+" twenty dollar bill(s)");
        int nextNumber = whole%20;
        System.out.println(" "+ nextNumber/10+ " ten dollar bill(s)");
        nextNumber %=10;
        System.out.println(" "+  nextNumber/5+ " five dollar bill(s)");
        nextNumber %=5;
        System.out.println(" "+ nextNumber + " one dollar bill(s)");
        
         //coins
        System.out.println( fractional+" cents in coins:");
        System.out.println(" "+fractional /25+ " quarter(s)");
        int nextNumberCoins = fractional%25;
        System.out.println(" "+ nextNumberCoins/10+ " dime(s)");
        nextNumberCoins %=10;
        System.out.println(" "+  nextNumberCoins/5+ " nickel(s)");
        nextNumberCoins %=5;
        System.out.println(" "+ nextNumberCoins+ " pennie(s)");
       
  }
}
