import java.util.Scanner;

public class Grader {

         Scanner input = new Scanner(System.in);
    //Variables
    private double HW01;
    private double HW02;

    private double Lab01;
    private double Lab02;
    private double Lab03;
    private double Lab04;

    private double Midterm01;
    private double Midterm02;
    private double FinalExam;
    private double TotalGrades;
    private double hwTotal;
    private double labTotal;
    private double midTotal;
    private  double finalTotal;


    private String FinalGrade;



    //Constructors
    Grader(){
        HW01 =0;
        HW02 =0;

        Lab01 =0;
        Lab02 =0;
        Lab03 =0;
        Lab04 =0;

        Midterm01 =0;
        Midterm02 =0;
        FinalExam =0;
        TotalGrades =0;
        hwTotal =0;
        labTotal= 0;
        midTotal= 0;
        finalTotal= 0;
    };

     //checkRange
    private double checkRange(double grade) {
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid Grade");
            System.exit(0);
        }
        return grade;
    }
    //Setters

    public void setHW01() {
        System.out.print("Enter the grade for HW 01: ");
        HW01 = checkRange(input.nextDouble());
    }

    public void setHW02() {
        System.out.print("Enter the grade for HW 02: ");
        HW02 = checkRange(input.nextDouble());
    }

    public void setLab01() {
        System.out.print("Enter the grade for Lab01: ");
        Lab01 = checkRange(input.nextDouble());
    }

    public void setLab02() {
        System.out.print("Enter the grade for Lab02: ");
        Lab02 = checkRange(input.nextDouble());
    }

    public void setLab03() {
        System.out.print("Enter the grade for Lab03: ");
        Lab03 = checkRange(input.nextDouble());
    }

    public void setLab04() {
        System.out.print("Enter the grade for Lab04: ");
        Lab04 = checkRange(input.nextDouble());
    }

    public void setMidterm01() {
        System.out.print("Enter the grade for Midterm 01: ");
        Midterm01 = checkRange(input.nextDouble());
    }

    public void setMidterm02() {
        System.out.print("Enter the grade for Midterm 02: ");
        Midterm02 = checkRange(input.nextDouble());
    }

    public void setFinalExam() {
        System.out.print("Enter the grade for the Final Exam: ");
        FinalExam = checkRange(input.nextDouble());
    }


    //Calculate final grade:
     public void calculateFinalGrade ()
    {
         hwTotal = ((HW01+HW02)/2)*0.10;
         labTotal = ((Lab01+Lab02+Lab03+Lab04)/4)*.40;
         midTotal =((Midterm01+Midterm02)/2)*0.25;
         finalTotal= (FinalExam)*0.25;
        TotalGrades = hwTotal +labTotal+ midTotal + finalTotal;

    }

    //Print Final grade
    public void printFinalGrade()
    {
        if (TotalGrades >= 90)
        {
            FinalGrade = "A";
        } else if (TotalGrades>=85) {
            FinalGrade ="B+";
        } else if (TotalGrades>=80) {
            FinalGrade ="B";
        }else if (TotalGrades>=75) {
            FinalGrade ="C+";
        }else if ( TotalGrades>=70) {
            FinalGrade ="C";
        }else if (TotalGrades>=65) {
            FinalGrade ="D+";
        }else if ( TotalGrades>=60) {
            FinalGrade ="D";
        }else if (60>TotalGrades) {
            FinalGrade ="F";
        }
        System.out.println("Your final grade is "+ TotalGrades+": "+FinalGrade);
    }

    public void printGrades() {
        System.out.println("These are the current grades.");
        System.out.println("\t(10%)\tHW 01 -"+HW01+ "\tHW 02 -"+ HW02);
        System.out.print("\t(40%)\tLab 01 -"+Lab01+ "\tLab 02 -"+ Lab02);
        System.out.println("\tLab 03 -"+Lab03+ "\tLab 04 -"+ Lab04);
        System.out.println("\t(25%)\tMidterm 01-"+Midterm01 +"\tMidterm 02 -"+ Midterm02);
        System.out.println("\t(25%)\tFinal Exam -"+FinalExam);
        printFinalGrade();
        System.out.println();

    }

}
