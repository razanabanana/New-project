
/**
 * Write a description of class player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class player
{
    public static void main(String args[])
    {
        String player;
        byte age;
        boolean check;
        byte newage;
        System.out.println ("Enter player name: ");
        player = new Scanner (System.in).nextLine();
        System.out.println ("Enter player age: ");
        age = new Scanner (System.in).nextByte();
        
        if (age >=18)
        {
            System.out.println ("You are old enough to play the game");
            check = true;
        }
        else if (age<18)
        {
            System.out.println ("You are not old enough!");
            check = false;
        }
        else 
        {
            System.out.println ("Please enter a valid age!");
            
        }
        
        newage = age;
        
    }
    
    public static byte newage (boolean check)
    {
       System.out.println ("Enter your age again: ");
       byte newage;
       newage = new Scanner (System.in).nextByte();
       if (newage >= 18)
       {
           check = true;
        }
       return newage;
    }
}
