/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

import java.util.Scanner;


public class SimpleExamStatistics {
    
    //States
    private double[] grades;
    private Scanner input;
    //Behaviors
    
    //Constructors
    
    public SimpleExamStatistics()
    {
        grades = new double[25];
        
        for (int i =0;i<grades.length;i++)
        {
            grades[i] = 0.0;
        }
        input = new Scanner(System.in);
      
    }
    public SimpleExamStatistics(int numStudents)
    {
            grades = new double[numStudents];
            for(int i = 0 ; i<grades.length;i++)
            {
                grades[i] = 0.0;
            }
            input = new Scanner(System.in);
    }
   public String toString()
   {
       String str = "Grades\n";
       for (int i = 0; i<grades.length;i++)
       {
            str +="\t Anonymus Student "+ (i+1) + ": "+ grades[i]+ "\n";
       }
       return str;
   }
    private void doInsertionSort()
    {
        double temp;
        for(int i =1; i<grades.length;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(grades[j]<grades[j-1])
                {
                    temp = grades[j];
                    grades[j] = grades[j-1];
                    grades[j-1] = temp;
                }
                else
                {
                    break;
                }
            }
        }
    }
    public void enterGrades() 
    {
        System.out.println("About to enter the Exam Grades. There are "+ grades.length+" students.");
        for(int i = 0;i<grades.length;i++)
        {
            System.out.print("The grade for the student "+(i+1)+ " is: ");
            try
            {
                double studentGrade = input.nextDouble();
                input.nextLine();
                grades[i] = studentGrade;                
            }catch(Exception E)
            {
                    System.out.println("Incorrect input .Exiting ");
                    System.exit(0);
            }
        } 
         doInsertionsSort();
    }
    
    public double minGrade() 
    {
        return grades[0];
    }
    
    public double maxGrade()
    {
        return grades[grades.length-1];
    }
      
    public double avrage()
    {
        double total = 0.0;
        for(int i =0;i<grades.length;i++)
        {
            total +=grades[i];
        }
        return (total/grades.length);
    }
}
