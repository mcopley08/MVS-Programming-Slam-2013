/**
 * Name: Michael Copley
 * Date: May 28th, 2013
 * Purpose: To create a program exercising the use of everything we've learned in AP Computer Science,
 * and to participate in a fun and friendly programming slam! And also relating our knowledge to number 
 * base conversions and intergalactic baseball.
 * 
 * This is the PairisPlayer class.
 * 
 * @author M. Copley
 * @version 05/28/13
 * 
 */

import java.util.*;
public class PairisPlayer extends Player 

{

    /**
     * Default Constructor to create an object of the PairisPlayer class.
     * All objects of this class have the planet name "Pairis" and the numberBase of 2
     * (as you can see in the constructor).  The constructor passes its arguments
     * to its superclass to instantiate the object.
     */
    public PairisPlayer(String playerName, String stringYear1, String stringYear2, String stringYear3)
    {
        super("Pairis", playerName, 2, stringYear1, stringYear2, stringYear3); //sending the constructor to the abstract player class
    }

    /**
     * Method that changes the player's binary values (base 2) for home runs into decimal (base 10) values
     * using the "parseInt()" method of the Integer class.
     */
    public void toDecimal() throws NumberFormatException     
    {
        int decimalYear1, decimalYear2, decimalYear3;  
        
        //getting the binary numbers        
        String binaryYear1 = getYear1();
        String binaryYear2 = getYear2();
        String binaryYear3 = getYear3();
        
        //converting the binary numbers to decimal numbers, and storing them.
        decimalYear1 = Integer.parseInt(binaryYear1, 2);
        decimalYear2 = Integer.parseInt(binaryYear2, 2);
        decimalYear3 = Integer.parseInt(binaryYear3, 2);
        
        //setting the players number of home runs for each year with their decimal equivalent.
        setYear1(decimalYear1);
        setYear2(decimalYear2);
        setYear3(decimalYear3);        

    }
    
    /**
     * This method prints out the results for a player from Pairis in base 2 (Binary) by using a for-each loop.
     * @param playerList The list of players sorted by their average number of home runs (highest to lowest).
     */
    public void printResults(List<Player> playerList)
    {
        System.out.println("Ranking for " + getName() + " from Pairis in Base 2 (Binary):");
        
        System.out.printf("\t" + "%-13s %-12s %-30s", "Name", "Planet", "Average Number of Home Runs");
        System.out.println();
        
        int playerRank = 1;
        
        for (Player temp : playerList)
        {
            int averageDecimal = temp.getAverage();
            String averageBinary = toBinary(averageDecimal); 
            
            System.out.print("\t" + playerRank + ". ");
            System.out.printf("%-11s", temp.getName());
            System.out.printf("%-24s", temp.getPlanet());
            System.out.printf("%-5s%n", averageBinary);
            
            playerRank++;
            
        }
        
        System.out.println("---------------------------------------------------------------------------");
    }
          
}