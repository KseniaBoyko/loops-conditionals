import java.util.*;
/**
 * Auto Generated Java Class.
 */
public class ThePlusBlock 
{
  
  
  public static void main(String[] args) 
  { 
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter the width");
    int width = scan.nextInt();
    System.out.println("Enter the height");
    int height = scan.nextInt();
    
    for (int i=1; i<=width; i++)
    {
      for (int j=1; j<=height; j++)
      {
        System.out.print("#");
      }
      System.out.println();
    }
  }
  
  /* ADD YOUR CODE HERE */
  
}
