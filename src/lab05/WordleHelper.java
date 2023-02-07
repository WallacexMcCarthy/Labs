/**
 * This lab goes over try, catch statements, as well as the substring methods in the String object class.
 *
 * @author Wallace McCarthy
 * @version 02/07/2023
 */

package lab05;

import java.io.File;
import java.util.Scanner;

public class WordleHelper
{

    /**
     * Given a filename, this method returns a count of the number of
     * words in the file.  (Note that word length is not checked here.)
     *
     * @param filename the name of an existing text file
     * @return the count of words in the file
     */
    public static int countWords (String filename)
    {
        int count = 0;
        try(Scanner in = new Scanner(new File(filename));)
        {
            while (in.hasNext())
            {
                in.next();
                count++;
            }
        }catch (Exception e)
        {
            System.out.println("Could not read the words: " + e.getMessage());
            return 0;  // Exit main now
        }
        return count;
    }

    /**
     * This method returns a copy of the input String, but with the
     * character at the specified position changed to the given letter.
     * Position must be a valid position in the String or the results
     * are undefined.
     *
     * Note that this function does not alter the original String, it
     * just returns a copy with a letter replaced.  Here is an example
     * of how this method can be used.
     *
     * word = replaceLetter(word, 1, 'a');
     *
     * If word originally contained "put", the word would now contain
     * "pat".
     *
     *
     * @param s any non-empty string
     * @param position a valid position in the string
     * @param letter a letter to put in the string
     * @return a copy of the original string, with a letter replaced
     */
    public static String replaceLetter(String s, int position, char letter)
    {
        return s.substring(0,position) + letter + s.substring(position + 1, s.length());
    }
}
