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
        File filename = new File("forest.txt");  // A file object just represents a path to a file
        Scanner file = new Scanner(filename);    // Opens the file for reading (scanning)
        // All your work will go here.


        file.close();
    }
}
