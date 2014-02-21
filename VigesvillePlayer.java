/**
 * Name: Michael Copley
 * Date: May 28th, 2013
 * Purpose: To create a program exercising the use of everything we've learned in AP Computer Science,
 * and to participate in a fun and friendly programming slam! And also relating our knowledge to number 
 * base conversions and intergalactic baseball.
 * 
 * This is the VigesvillePlayer class.
 * 
 * @author M. Copley
 * @version 05/28/13
 * 
 */

import java.util.*;
public class VigesvillePlayer extends Player 

{

    /**
     * Default Constructor to create an object of the VigesvillePlayer class.
     * All objects of this class have the planet name "Vigesville" and the numberBase of 20
     * (as you can see in the constructor).  The constructor passes its arguments
     * to its superclass to instantiate the object.
     */
    public VigesvillePlayer(String playerName, String stringYear1, String stringYear2, String stringYear3)
    {
        super("Vigesville", playerName, 20, stringYear1, stringYear2, stringYear3); //sending the constructor to the abstract player class
    }

    /**
     * Method that changes the player's vigesimal values (base 20) for home runs into decimal (base 10) values
     * using the "parseInt()" method of the Integer class.
     */
    public void toDecimal() throws NumberFormatException     
    {
        int decimalYear1, decimalYear2, decimalYear3;  
        
        //getting the binary numbers        
        String vigesimalYear1 = getYear1();
        String vigesimalYear2 = getYear2();
        String vigesimalYear3 = getYear3();
        
        //converting the vigesimal numbers to decimal numbers, and storing them.
        decimalYear1 = Integer.parseInt(vigesimalYear1, 20);
        decimalYear2 = Integer.parseInt(vigesimalYear2, 20);
        decimalYear3 = Integer.parseInt(vigesimalYear3, 20);
        
        //setting the players number of home runs for each year with their decimal equivalent.
        setYear1(decimalYear1);
        setYear2(decimalYear2);
        setYear3(decimalYear3);        

    }
    
    /**
     * This method prints out the results for a player from Vigesville in base 20 (Vigesimal) by using a for-each loop.
     * @param playerList The list of players sorted by their average number of home runs (highest to lowest).
     */
    public void printResults(List<Player> playerList)
    {
        System.out.println("Ranking for " + getName() + " from Vigesville in Base 20 (Vigesimal):");
        
        System.out.printf("\t" + "%-13s %-12s %-30s", "Name", "Planet", "Average Number of Home Runs");
        System.out.println();
        
        int playerRank = 1;
        
        for (Player temp : playerList)
        {
            int averageDecimal = temp.getAverage();
            String averageVigesimal = toVigesimal(averageDecimal); 

            System.out.print("\t" + playerRank + ". ");
            System.out.printf("%-11s", temp.getName());
            System.out.printf("%-24s", temp.getPlanet());
            System.out.printf("%-5s%n", averageVigesimal);
            
            playerRank++;
            
        }
        
        System.out.println("---------------------------------------------------------------------------");
    }
          
}