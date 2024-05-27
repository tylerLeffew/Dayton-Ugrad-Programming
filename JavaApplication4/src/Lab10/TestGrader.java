/*
 *Author: Ahmed Alharbi
 * Date: 25/05/2024
 *Project overview: Calculate the student grades by using the Grader class
 *
 *Recoures:
 *1-Chapter 05: Classes and Methods( Nicholas M. Stiffler).
 *
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        Grader myGrader = new Grader();
        while (true) {
            prompt(myGrader);

            try {
                // Get the user's answer
                int userinput = scan.nextInt();
                // Catch the eol
                scan.nextLine();

                switch (userinput) {
                    case 1:
                        myGrader.setHW01();
                        myGrader.calculateFinalGrade();
                        break;
                    case 2:
                        myGrader.setHW02();
                        myGrader.calculateFinalGrade();
                        break;
                    case 3:
                        myGrader.setLab01();
                        myGrader.calculateFinalGrade();
                        break;
                    case 4:
                        myGrader.setLab02();
                        myGrader.calculateFinalGrade();
                        break;
                    case 5:
                        myGrader.setLab03();
                        myGrader.calculateFinalGrade();
                        break;
                    case 6:
                        myGrader.setLab04();
                        myGrader.calculateFinalGrade();
                        break;
                    case 7:
                        myGrader.setMidterm01();
                        myGrader.calculateFinalGrade();
                        break;
                    case 8:
                        myGrader.setMidterm02();
                        myGrader.calculateFinalGrade();
                        break;
                    case 9:
                        myGrader.setFinalExam();
                        myGrader.calculateFinalGrade();
                        break;
                    default:
                        System.exit(1);
                }
            } catch (Exception e) {
                System.out.println("You did not enter a valid input. Exiting.");
                System.exit(1);
            }
        }
    }

    public static void prompt(Grader g) {
       g.printGrades();
        System.out.println("What would you like to do?");
        System.out.println("Enter 1: To enter a grade for HW 01");
        System.out.println("Enter 2: To enter a grade for HW 02");
        System.out.println("Enter 3: To enter a grade for Lab 01");
        System.out.println("Enter 4: To enter a grade for Lab 02");
        System.out.println("Enter 5: To enter a grade for Lab 03");
        System.out.println("Enter 6: To enter a grade for Lab 04");
        System.out.println("Enter 7: To enter a grade for Midterm 01");
        System.out.println("Enter 8: To enter a grade for Midterm 02");
        System.out.println("Enter 9: To enter a grade for the Final Exam");
        System.out.println("Enter 0: To Quit");
        System.out.println();
    }

}

