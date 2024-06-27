public class ClassRoster {
   //States
    private String[] roster;


    //Behaviors

        //Constructors

    //A default constructor
    public ClassRoster()
    {
        roster = new String[3];
        roster[0] = "John Doe";
        roster[1] = "Jane Smith";
        roster[2] = "John Hancock";
    }

    //A parameterized constructor that accepts an integer numStudents
    public ClassRoster(int numStudents)
    {
        roster = new String[numStudents];

        for (int i = 0; i < roster.length; i++)
        {
            roster[i] = "";
        }
    }

    //A parameterized constructor that accepts a String array called names.
    public ClassRoster(String[] names)
    {
        roster = names;
    }

    //Printing the class roster line by line
    public String toString()
    {
        String str = "ClassRoster: \n";
        for (int i = 0; i < roster.length; i++)
        {
            str = str + roster[i] + "\n";
        }
        return str;
    }
    //Adding students to a roster by index and name.
    public void addStudent(int index, String name)
    {
        if (index < 0 || index > roster.length)
        {
            System.out.println("Error: Index out of bounds. unable to add a student ");
            return;
        }
        roster[index] = name;
    }


    //Sorting names in alphabetical order
    public String[] sortedNames()
    {
        String[] temp = roster.clone();
        for (int i = 1; i < roster.length; i++)
        {
            for(int j= i; j>0;j--)
            {
                if (temp[j].compareTo(temp[j-1]) <0)
                {
                    String swap = temp[j];
                    temp[j] = temp[j-1];
                    temp[j-1] = swap;
                }else
                {
                    break;
                }
            }
        }
        return temp;
    }

}
