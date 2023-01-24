package lab03;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TreeDataAnalyzer
{
    public static void main(String[] args) throws IOException
    {
        String treeName;
        int    treeCount;
        File filename = new File("src/lab03/forest.txt");  // A file object just represents a path to a file
        Scanner file = new Scanner(filename);    // Opens the file for reading (scanning)
        // All your work will go here.
        for(int count = 0; file.hasNext(); count++)
        {
            treeName = file.next(); // Use the scanner, scan the 'next' word from the file.
            treeCount = file.nextInt(); // Use the scanner, scan the 'next' int from the file.
            System.out.println("Tree: " + treeName + " has a count of " + treeCount + ".");
        }
        // Reopen the file.  (Build a new Scanner, store it in our file
        // variable.  The new Scanner scans from the beginning of the file.)

        file = new Scanner(filename);

        // Create a few variables for keeping track of the 'best' tree
        // found so far.

        String bestTreeName = null;
        int bestTreeCount = 0;

        // Loop, read in values, attempt to find the tree with the
        // highest count.

        int loopCount = 0;
        while (file.hasNext())
        {
            // Advance the counter.

            loopCount++;

            // Read in the data

            treeName = file.next(); // Use the scanner, scan the 'next' word from the file.
            treeCount = file.nextInt(); // Use the scanner, scan the 'next' int from the file.

            // If it's the first tree, or if the current tree count
            // is higher than the best one found so far, keep it.

            // the error was using the "and" keywords - && - rather than the "or" - || - one.

            if (loopCount == 1 || treeCount > bestTreeCount)
            {
                // We've just read in the best tree so far.  Keep a copy
                // of it's data.

                bestTreeName = treeName;
                bestTreeCount = treeCount;
            }

            // Loop end.
        }

        // Print out the tree with the highest count.

        System.out.println("'Best' tree: " + bestTreeName + " has a count of " + bestTreeCount + ".");

        // Close the file.

        file.close();
    }
}
