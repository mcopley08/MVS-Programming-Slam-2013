/**
 * Name: Michael Copley
 * Date: May 28th, 2013
 * Purpose: To create a program exercising the use of everything we've learned in AP Computer Science,
 * and to participate in a fun and friendly programming slam! And also relating our knowledge to number 
 * base conversions and intergalactic baseball.
 * 
 * This is the BattingChallengeTester class.
 * 
 * @author M. Copley
 * @version 05/28/13
 * 
 */

import java.util.Collections;
import java.util.*;
public class BattingChallengeTester
{
    public static List<Player> playerList = new ArrayList<Player>();  //initialising the arraylist for players
    
    public static void main(String []args)
    {
           //initializing players to the arraylist of players       
           playerList.add(new HexPlayer("Martin", "2D", "23", "48"));
           playerList.add(new PairisPlayer("Felix", "100101", "101100", "1010010"));
           playerList.add(new HexIIIPlayer("Monique", "14", "1B", "28"));
           playerList.add(new VigesvillePlayer("Virgil", "2C", "2D", "2B"));
           playerList.add(new OctalOrbPlayer("Otto", "65", "100", "72"));
           playerList.add(new EarthPlayer("Derek", "67", "61", "52"));
           playerList.add(new DozenalPlayer("Dodie", "49", "52", "34"));
           
           //this for-each loop converts all of the players' home runs into the decimal system, and calculates the average.
           for (Player temp : playerList)
           {
               temp.toDecimal();
               temp.calcAverage();
           }
           
           bubbleSort(playerList);   //this sorts players by their averages.
           
           //printing the results for each player in their own number systems.
           for (Player temp: playerList)
           {
               temp.printResults(playerList);
           }
                      
    }
    
    /**
     * Method that sorts the list of players by their averages (highest to lowest) using the "Bubble Sort" method.
     * @param source The list of players in the Universal Batting Challenge.
     */
    public static void bubbleSort(List<Player> source)
    {
           int out, in;
           Player temp;
        
           for (out = source.size() - 1; out > 1; out--)  
           {
               for (in = 0; in < out; in++)    
               {
                    if( source.get(in).getAverage() < source.get(in + 1).getAverage() )  
                    {     
                        Collections.swap(source,in + 1, in);                       
                    }
               }
           }
    } 
                    
}
    
