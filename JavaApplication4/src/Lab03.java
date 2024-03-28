/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author med0v
 */ 
import java.util.Scanner;
import java .text . DecimalFormat ;

public class Lab03 {
                

    public static void main (String[]args){
        //Taking the values:
        
       Scanner luigi = new Scanner(System.in);
       DecimalFormat twoDigit = new DecimalFormat ("###### ,##0.00 ");
       System.out.print("Enter the amount: ");
       
        String amount = twoDigit . format ( luigi . nextDouble ());
        String[] startingBill = String.valueOf(amount).split("\\.");
   
        double dollarsBills = Double.parseDouble(startingBill[0]); //#.0
        double cents = Double.parseDouble(startingBill[1]);//0.#
         System.out.println(amount +"$ Can be split into the following: ");
         
        //Breaking down Dollar Bills:
                    System.out.println((int)(dollarsBills) +" dollars in bills:");

        double billAfterChange = 0;                                             //The reminder after going from bigger to smaller bill
                       System.out.println("   "+(int)(dollarsBills/20) +" twenty dollar bill(s)");
                        billAfterChange = dollarsBills %20;
                          System.out.println("   "+(int)(billAfterChange/10)+ " ten dollar bill(s)");
                        billAfterChange %= 10;
                         System.out.println("   "+(int)(billAfterChange/5)+ " five dollar bill(s)");
                        billAfterChange %= 5;
                         System.out.println("   "+(int)(billAfterChange) + " one dollar bill(s)");
                               //Breaking down Dollar Bills:
                        System.out.println((int)(cents) +" cents in coins:");
                       double centsAfterChange = 0;
                    
                       System.out.println("   "+(int)(cents/25) + " quarter(s)");
                        centsAfterChange = cents %25;
                          System.out.println("   "+(int)(centsAfterChange/10) + " dime(s)");
                       centsAfterChange %= 10;
                         System.out.println("   "+(int)(centsAfterChange/5) + " nickel(s)");
                        centsAfterChange %= 5;
                         System.out.println("   "+(int)(centsAfterChange) + " pennie(s)");              

    
    }
}
