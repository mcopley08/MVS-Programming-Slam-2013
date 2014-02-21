/**
 * Name: Michael Copley
 * Date: May 28th, 2013
 * Purpose: To create a program exercising the use of everything we've learned in AP Computer Science,
 * and to participate in a fun and friendly programming slam! And also relating our knowledge to number 
 * base conversions and intergalactic baseball.
 * 
 * This is the EarthPlayer class.
 * 
 * @author M. Copley
 * @version 05/28/13
 * 
 */

import java.util.*;
public class EarthPlayer extends Player 

{

    /**
     * Default Constructor to create an object of the EarthPlayer class.
     * All objects of this class have the planet name "Earth" and the numberBase of 10
     * (as you can see in the constructor).  The constructor passes its arguments
     * to its superclass to instantiate the object.
     */
    public EarthPlayer(String playerName, String stringYear1, String stringYear2, String stringYear3)
    {
        super("Earth", playerName, 10, stringYear1, stringYear2, stringYear3); //sending the constructor to the abstract player class
    }

    /**
     * Method that sets the player's string values for their amount of home runs to the object's 
     * respective "int" variables for each of them (No number base conversion is needed, because
     * the string is already in Decimal format). This also uses the "parsenInt()" method.
     */
    public void toDecimal() throws NumberFormatException     
    {
        int decimalYear1, decimalYear2, decimalYear3;  
        
        //getting the decimal numbers in string format       
        String stringDecimalYear1 = getYear1();
        String stringDecimalYear2 = getYear2();
        String stringDecimalYear3 = getYear3();
        
        //converting the string representations of the decimal numbers into integer equivalents.
        decimalYear1 = Integer.parseInt(stringDecimalYear1, 10);
        decimalYear2 = Integer.parseInt(stringDecimalYear2, 10);
        decimalYear3 = Integer.parseInt(stringDecimalYear3, 10);
        
        //setting the players number of home runs for each year with their decimal equivalent.
        setYear1(decimalYear1);
        setYear2(decimalYear2);
        setYear3(decimalYear3);

    }
    
    /**
     * This method prints out the results for a player from Earth in base 10 (Decimal).
     * @param playerList The list of players sorted by their average number of home runs (highest to lowest).
     */
    public void printResults(List<Player> playerList)
    {
        System.out.println("Ranking for " + getName() + " from Earth in Base 10 (Decimal):");
        
        System.out.printf("\t" + "%-13s %-12s %-30s", "Name", "Planet", "Average Number of Home Runs");
        System.out.println();
        
        int playerRank = 1;
        
        for (Player temp : playerList)
        {
                        
            System.out.print("\t" + playerRank + ". ");
            System.out.printf("%-11s", temp.getName());
            System.out.printf("%-24s", temp.getPlanet());
            System.out.printf("%-5s%n", temp.getAverage());
            
            playerRank++;
            
        }
        
        System.out.println("---------------------------------------------------------------------------");
    }
          
}
