
/**
 *
 * @author Ahmed
 */
import java.util.Scanner;
import java.lang.Math;
public class lab2Fahrenhite2Celsius {
       public static void main(String [] args)
       {
            Scanner luigi = new Scanner(System.in);
            
            System.out.println("Enter a Fehrenhite dgree: ");
            double f = Math.round((luigi.nextDouble()*10.0))/10.0;    //Taking user input and round it up to the nearest 10th
            double c= (f-32)*5/9;                                                                 //Converting F to C
             c= Math.round(c*10.0)/10.0;                                                   //Rounding C to the nearest 10th
            System.out.println("Your dgree in Fehrenhite is "+f);
            System.out.println("Your dgree in Celsius  is "+c );

            
       }
}
