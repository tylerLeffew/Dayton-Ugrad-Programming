/*
 *Author: Ahmed Alharbi
 * Date: 22/06/2024
 *Project overview: Calculate the student grades by using the Grader class
 *
 *Recoures:
 *1-Chapter 07: Arrays( Nicholas M. Stiffler).
 *
 */
package lab13;

public class Lab13 {
    public static void main(String[] args) {
        SimpleExamStatistics defualtStats = new SimpleExamStatistics();
        SimpleExamStatistics smallClass = new SimpleExamStatistics(5);
        smallClass.enterGrades();
        System.out.println(smallClass);

       System.out.println("The minimun grade was: "+ smallClass.minGrade());
       System.out.println("The maximum grade was: "+ smallClass.maxGrade());
       System.out.println("The avrage was: "+ smallClass.avrage() );
    }
  
}
