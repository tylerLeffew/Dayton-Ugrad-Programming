import java.util.*;

public class ClassRoster{
private String[] roster;

public ClassRoster(){
    roster = new String[] {"John Doe","Jane Smith","John Hancock"};
}
public ClassRoster(int length){
    roster = new String[length];
}
public ClassRoster(String[] rosterIn){
    roster = rosterIn;
}
public void addStudent(int index,String student){
    if (index<0||index>=roster.length){
        System.out.println("Invalid index. Not adding student");
    }
    else{
        roster[index]= student;
    }
}
public String[] sortedNames(){
    Arrays.sort(roster);
    return roster;
}
public String toString(){
    String out = "";
    for (String name : roster){
        out += name + "\n";
    }
    return out;
}
}
