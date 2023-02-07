/**
 * This lab goes over try, catch statements.
 *
 * @author Wallace McCarthy
 * @version 02/07/2023
 */

package lab05;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilterWords
{
    public static void main(String[] args)
    {
        String word;
        try (Scanner in = new Scanner(new File("words.txt"));
             PrintWriter out = new PrintWriter(new File("five.txt"));)
        {
            word = in.next();
            System.out.println("The first word in the file is:  " + word);

            while (in.hasNext())
            {
                word = in.next();
                if (word.length() == 5)
                {
                    out.println(word);
                }
            }

        }catch(Exception e)
        {
            System.out.println("Could not read the words: " + e.getMessage());
            return;  // Exit main now
        }




    }

}
