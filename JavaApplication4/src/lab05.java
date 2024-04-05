import java.util.Scanner;
public class lab05 {
    
    private static final String PASSWORD = "supercalifragilisticexpialidocious";
    public static void main(String []args)
    {
          Scanner luigi = new Scanner(System.in);
          //   Variables:
          String companyName = "Disney";
          String userName;
          String userPasswordTrial1;
          String userPasswordTrial2;
          
          System.out.println(companyName +"Password Checker");
          System.out.println("Please enter your username: ");
          userName = luigi.nextLine();
          System.out.println("Please enter your password: ");
          userPasswordTrial1 = luigi.next();
         
         
         //First trial:
         if (userPasswordTrial1.equals(PASSWORD))
            {
                System.out.println("Access Granted.");
                System.out.println("Welcome to Disney World, "+ userName +"!");
                
             }
        else 
              {
                 System.out.println("Invalid password for "+userName + ", try again: ");
                 System.out.println("Please enter your password: ");
                  userPasswordTrial2 = luigi.next();
                  
                //Second trial
             if (userPasswordTrial2.equals(PASSWORD))
            {
                 System.out.println("Access Granted.");
                System.out.println("Welcome to Disney World, "+ userName +"!");
            }else
             {
                   System.out.println("Invalid password for "+userName);
                   System.out.println("You have reached the maximum number of tries on this system, Exiting now.");
                    System.exit(0);
             }
            } 
       
         
    
   
}
}
