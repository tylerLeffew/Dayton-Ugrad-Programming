/*
 *Author: Ahmed Alharbi
 * Date: 26/06/2024
 *Project overview: Calculate the student grades by using the Grader class
 *
 *Resources:
 *1-Chapter 07: Arrays( Nicholas M. Stiffler).
 *
 */

public class TestRoster {
    public static void main(String[] args) {

        //Testing the default constructor
        ClassRoster defaultRoster = new ClassRoster();
        System.out.println(defaultRoster);

       //Testing the first parameterized constructor
        ClassRoster parameterizedRoaster = new ClassRoster(2);
        System.out.println(parameterizedRoaster);

        //Testing adding students by addStudent method
        parameterizedRoaster.addStudent(0,"Ahmed");
        parameterizedRoaster.addStudent(1,"Kimomo");
        System.out.println(parameterizedRoaster);

        //Testing Index out of bounds error
        parameterizedRoaster.addStudent(99,"Jk");

        //Testing the second parameterized constructor
        String[] names = {"Sue", "Juba", "Josh"};
        ClassRoster arrayRoster = new ClassRoster(names);
        System.out.println(arrayRoster);

        //Testing sorting an array by sortedNames
        String[] namesSorted = arrayRoster.sortedNames();
        for (int i = 0; i < namesSorted.length; i++) {
            System.out.println(namesSorted[i]);
        }

    }
}