import java.util.*;

public class MyMadLib {
   public static void main(String[] args) {
   
      /** Text in orange in JGrasp like this are called comments.
        * A comment is text that is written by someone like you
        * that describes what the code is doing.
        *
        * For now, the comments are used to guide you on what to do.
        * We will talk about comments in general in a future class. 
        */
      
      /* Write code that will output to the user "Hello world!" */
      System.out.println("I wrote some intro here!");
      
      
      
      Scanner input = new Scanner(System.in);
      MadLib madLib = new MadLib("fileToUse.txt");
      MadLibReader runThis = new MadLibReader(madLib);     
   }
}