/**
 * Name: Michael Copley
 * Date: May 28th, 2013
 * Purpose: To create a program exercising the use of everything we've learned in AP Computer Science,
 * and to participate in a fun and friendly programming slam! And also relating our knowledge to number 
 * base conversions and intergalactic baseball.
 * 
 * @author M. Copley
 * @version 05/28/13
 * 
 */

import java.util.*;
public abstract class Player
{
    //private instance variables
    private String planet, playerName, stringYear1, stringYear2, stringYear3, stringAverage;
    private int numberBase, year1, year2, year3, playerAverage;
    
    /**
     * Constructor to create an object of the Player class.
     * @param planet The planet the player is from.
     * @param playerName The name of the player.
     * @param numberBase The number base system the player's home planet uses.
     * @param stringYear1 The number of home runs hit in the player's first year.
     * @param stringYear2 The number of home runs hit in the player's second year.
     * @param stringYear3 The number of home runs hit in the player's third year.
     */
    Player(String planet, String playerName, int numberBase, String stringYear1, String stringYear2, String stringYear3)
    {
        this.planet = planet;
        this.playerName = playerName;
        this.numberBase = numberBase;
        this.stringYear1 = stringYear1;
        this.stringYear2 = stringYear2;
        this.stringYear3 = stringYear3;
    }
        
    //***************************************Mutator Methods*************************************************
      
        
    /**
     * Method that calculates the average number of home runs for a given player.
     * Pre-Condition: The number of home runs for each year MUST be in base 10 (decimal).
     */
    public void calcAverage()
    {
        playerAverage = year1 + year2 + year3;
        playerAverage /= 3;
    }
    
    /**
     * Method that sets the value of year1 to the base 10 (decimal) number passed to this method.
     * @param base10 The number of home runs hit in the player's first year in base 10.
     */
    public void setYear1(int base10)
    {
        year1 = base10;
    }
    
    /**
     * Method that sets the value of year2 to the base 10 (decimal) number passed to this method.
     * @param base10 The number of home runs hit in the player's second year in base 10.
     */
    public void setYear2(int base10)
    {
        year2 = base10;
    }
    
    /**
     * Method that sets the value of year3 to the base 10 (decimal) number passed to this method.
     * @param base10 The number of home runs hit in the player's third year in base 10.
     */
    public void setYear3(int base10)
    {
        year3 = base10;
    }
    
       
    /**
     * Method that changes a decimal number into a number in the hexidecimal number system.
     */
    public String toHexidecimal(int base10)
    {
        return Integer.toString(base10, 16);
    }
    
    /**
     * Method that changes a decimal number into a number in the binary number system.
     */
    public String toBinary(int base10)
    {
        return Integer.toString(base10, 2);
    }
    
    /**
     * Method that changes a decimal number into a number in the hexitridecimal number system.
     */
    public String toHexitridecimal(int base10)
    {
        return Integer.toString(base10, 36);
    }
    
    /**
     * Method that changes a decimal number into a number in the vigesimal number system.
     */
    public String toVigesimal(int base10)
    {
        return Integer.toString(base10, 20);
    }
    
    /**
     * Method that changes a decimal number into a number in the octal number system.
     */
    public String toOctal(int base10)
    {
        return Integer.toString(base10, 8);
    }
    
    /**
     * Method that changes a decimal number into a number in the duodecimal number system.
     */
    public String toDuodecimal(int base10)
    {
        return Integer.toString(base10, 12);
    }
    
    
    //***************************************Getter Methods**************************************************
    
    /**
     * Method that returns the name of the player's home planet.
     * @return The name of the player's home planet.
     */
    public String getPlanet()
    {
        return planet;
    }
    
    /**
     * Method that returns the name of the player.
     * @return The name of the player.
     */
    public String getName()
    {
        return playerName;
    }
    
    /**
     * Method that returns string value of the number of home runs the player hit in their first year.
     * @return The number of home runs the player got in their first year (in their home planet's number system).
     */
    public String getYear1()
    {
        return stringYear1;
    }
    
    /**
     * Method that returns string value of the number of home runs the player hit in their second year.
     * @return The number of home runs the player got in their second year (in their home planet's number system).
     */
    public String getYear2()
    {
        return stringYear2;
    }
    
    /**
     * Method that returns string value of the number of home runs the player hit in their third year.
     * @return The number of home runs the player got in their third year (in their home planet's number system).
     */
    public String getYear3()
    {
        return stringYear3;
    }
    
    /**
     * Method that returns the average number of home runs for the player..
     * @return The average number of home runs the player hits per year (calculated over 3 years).
     */
    public int getAverage()
    {
        return playerAverage;
    }
    
    //***************************************Abstract Methods************************************************
    
    /**
     * Method that converts the number of home runs hit each year into base 10 (decimal) and 
     * initialises the "int" value for each respective string. Nothing is returned.
     */
    public abstract void toDecimal();
    
    /**
     * Method that prints out the results of the Universal Batting Challenge to the user in each
     * player's own unique number system.
     * @param playerList The list of the players sorted by their average number of home runs (highest to lowest).
     */
    public abstract void printResults(List<Player> playerList);
    
    
        
}
    