
    import java.util.Scanner;
public class lab04 {
    public static void main(String[]args)
    {  
        Scanner luigi = new Scanner(System.in);
        
        
        //variables
        int  sentenceLength;
        
        int  sentence_A;
        int  sentence_a;
        int  sentence_E;
        int  sentence_e;
        int  sentence_I;
        int  sentence_i;
        int  sentence_O;
        int  sentence_o;
        int  sentence_U;
        int  sentence_u;
        
        int  sentenceUpper;
        String  sentenceNoUpperVowels;
        
        int  sentenceLower;
        String  sentenceNoLowerVowels;
        
        int  sentenceVowels;
        String  sentenceNoVowels;
        
        //number of characters
        System.out.println("Enter the sentence you want to analyze: ");
        //Getting user input
        String sentence = luigi.nextLine();
        sentenceLength = sentence.length();
        System.out.println("The number of charactes is "+sentenceLength+".");
        
     //number of single vowles
    sentence_A = sentence.length()- sentence.replace("A", "").length();
    System.out.println( "There is  "+sentence_A+" A`s.");
    sentence_a =  sentence.length()-  sentence.replace("a", "").length();
    System.out.println( "There is  "+ sentence_a+" a`s.");
     sentence_E =  sentence.length()-  sentence.replace("E", "").length();
    System.out.println( "There is  "+ sentence_E+" E`s.");
     sentence_e =  sentence.length()-  sentence.replace("e", "").length();
    System.out.println(  "There is  "+sentence_e+" e`s.");
     sentence_I =  sentence.length()-  sentence.replace("I", "").length();
    System.out.println( "There is  "+ sentence_I+" I`s.");
     sentence_i =  sentence.length()-  sentence.replace("i", "").length();
    System.out.println( "There is  "+ sentence_i+" i`s.");
     sentence_O =  sentence.length()-  sentence.replace("O", "").length();
    System.out.println( "There is  "+ sentence_O+" O`s.");
     sentence_o =  sentence.length()-  sentence.replace("o", "").length();
    System.out.println( "There is  "+ sentence_o+" o`s.");
     sentence_U =  sentence.length()-  sentence.replace("U", "").length();
    System.out.println( "There is  "+ sentence_U+" U`s.");
     sentence_u =  sentence.length()-  sentence.replace("u", "").length();
    System.out.println( "There is  "+ sentence_u+" u`s.");
    
        //number of uppercase vowles
        System.out.println("The sentence without uppercase vowles is: "+ sentence.replaceAll("[AEIOU]", "")+".");
        sentenceUpper =  sentenceLength -  sentence.replaceAll("[AEIOU]", "").length();
        System.out.println( "There is  "+ sentenceUpper +" uppercase vowles.");
    
        //number of lowercase vowles
        System.out.println( "The sentence without lowercase vowles is: "+sentence.replaceAll("[aeiou]", "")+".");
        sentenceLower =  sentenceLength -  sentence.replaceAll("[aeiou]", "").length();
        System.out.println( "There is  "+ sentenceLower+"  lowercase vowles." );
        
         //number of vowles
        System.out.println("The sentence without vowles is: "+ sentence.replaceAll("[AEIOUaeiou]", "")+"."); 
        sentenceVowels =  sentenceLength -  sentence.replaceAll("[AEIOUaeiou]", "").length();
        System.out.println( "There is  "+ sentenceVowels+" vowel.");
    }
}
