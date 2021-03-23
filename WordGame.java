import java.util.*;
/**
 * Auto Generated Java Class.
 */
public class WordGame 
{
  
  
  public static void main(String[] args) 
  { 
    String word = "";
    int score = 0;
    int count = 0;
    char restart = 'n';
    
    do
    {
     score = 0;
     count = 0;
     char letter = (char)(Math.random() * (122 - 97 + 1) + 97);
    
    System.out.println("Type a word starting with "+letter);
    System.out.println("If all the letters of the word are in ascending order (fore example ACE) then the base score is multiplied by 3" );
    
    Scanner scan = new Scanner(System.in);
    word = scan.nextLine();
    if(word.charAt(0) != letter)
    {
      score = 0;
      System.out.print("your word doesn't start with "+letter+". you got "+ score);
    }else 
    {
      for (int i = 0; i<word.length(); i++)
      {
        score+=word.charAt(i);
      }
      for (int j = 0; j<word.length()-1; j++)
      {
      if(word.charAt(j) < word.charAt(j+1))
        {
          count++;
        }
      }
     if(count == word.length()-1)
     {
       score = score*3;
     }
    }
    System.out.println("you got:  "+score);
    System.out.println("Do you want to play again? (y/n)");
    restart = scan.next().charAt(0);
    }while(restart == 'y');
   System.out.println("Thank you for playing!!!!!");
  }
  
  /* ADD YOUR CODE HERE */
  
}
