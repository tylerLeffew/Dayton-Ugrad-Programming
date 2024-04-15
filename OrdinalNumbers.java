import java.util.*;
public class OrdinalNumbers {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Ordinals();


    }
    public static void Ordinals(){
        System.out.println("Enter a number 1-1000. Negative to quit ->");
        int end = in.nextInt();
        if (end<0){System.exit(0);}
        else if (end==0|| end> 1000){
            System.out.println("Invalid Number. Try Again.");
            Ordinals();
        }
        else if(end>0&&end<1000){
            for(int i = 0;i<=end;i++){
                int x = i %100;
                String num = Integer.toString(x);
                if (num.equals("11")||num.equals("12")||num.equals("13")){
                    System.out.println(i+"th");
                    
                }
                else if(num.substring(num.length()-1).equals("1")){
                    System.out.println(i+"st");
                   
                }
                else if(num.substring(num.length()-1).equals("2")){
                    System.out.println(i+"nd");
                    
                }
                else if(num.substring(num.length()-1).equals("3")){
                    System.out.println(i+"rd");

                }
                else{
                    System.out.println(i+"th");
                }
                
            }
        }

    }
}
