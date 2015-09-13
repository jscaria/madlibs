import java.util.Scanner;

public class MadLib {

   public static String noun = null;
   public static String verb = null;
   public static String adjective = null;
   public static Scanner scanner = new Scanner(System.in);
   
   public static void processVerb() {
      verb = scanner.nextLine();
   }
   
   public static void processNoun() {
      noun = scanner.nextLine();
   } 
   
   public static void processAdjective() {
      adjective = scanner.nextLine();
   }     
   
   public static void output() {
      System.out.println("\nThe " + adjective + " teacher " + verb + " my " + noun + ", and I've never recovered.");
   }
}