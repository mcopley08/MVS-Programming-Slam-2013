/**
 * Name: Michael Copley
 * Date: May 28th, 2013
 * Purpose: To create a program exercising the use of everything we've learned in AP Computer Science,
 * and to participate in a fun and friendly programming slam! And also relating our knowledge to number 
 * base conversions and intergalactic baseball.
 * 
 * This is the OctalOrbPlayer class.
 * 
 * @author M. Copley
 * @version 05/28/13
 * 
 */

import java.util.*;
public class OctalOrbPlayer extends Player 

{

    /**
     * Default Constructor to create an object of the OctalOrbPlayer class.
     * All objects of this class have the planet name "Octal Orb" and the numberBase of 8
     * (as you can see in the constructor).  The constructor passes its arguments
     * to its superclass to instantiate the object.
     */
    public OctalOrbPlayer(String playerName, String stringYear1, String stringYear2, String stringYear3)
    {
        super("Octal Orb", playerName, 8, stringYear1, stringYear2, stringYear3); //sending the constructor to the abstract player class
    }

    /**
     * Method that changes the player's octal values (base 8) for home runs into decimal (base 10) values
     * using the "parseInt()" method of the Integer class.
     */
    public void toDecimal() throws NumberFormatException   
    {
        int decimalYear1, decimalYear2, decimalYear3; 
        
        //getting the octal numbers        
        String octalYear1 = getYear1();
        String octalYear2 = getYear2();
        String octalYear3 = getYear3();
        
        //converting the vigesimal numbers to decimal numbers, and storing them.
        decimalYear1 = Integer.parseInt(octalYear1, 8);
        decimalYear2 = Integer.parseInt(octalYear2, 8);
        decimalYear3 = Integer.parseInt(octalYear3, 8);
        
        //setting the players number of home runs for each year with their decimal equivalent.
        setYear1(decimalYear1);
        setYear2(decimalYear2);
        setYear3(decimalYear3);        

    }
    
    /**
     * This method prints out the results for a player from OCtal Orb in base 8 (Octal) by using a for-each loop.
     * @param playerList The list of players sorted by their average number of home runs (highest to lowest).
     */
    public void printResults(List<Player> playerList)
    {
        System.out.println("Ranking for " + getName() + " from Octal Orb in Base 8 (Octal):");
        
        System.out.printf("\t" + "%-13s %-12s %-30s", "Name", "Planet", "Average Number of Home Runs");
        System.out.println();
        
        int playerRank = 1;
        
        for (Player temp : playerList)
        {
            int averageDecimal = temp.getAverage();
            String averageOctal = toOctal(averageDecimal); 

            System.out.print("\t" + playerRank + ". ");
            System.out.printf("%-11s", temp.getName());
            System.out.printf("%-24s", temp.getPlanet());
            System.out.printf("%-5s%n", averageOctal);
            
            playerRank++;
            
        }
        
        System.out.println("---------------------------------------------------------------------------");
    }
          
}