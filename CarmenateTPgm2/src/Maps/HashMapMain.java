package Maps;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

/*
 Author     : Triana Carmenate
 Course     : COP 3530; Data Structures ; 2PM - 3:15PM
 Professor  : Michael Robinson 
 Program    : Program Number 2, Imlement Ch5 and 6 Ideas
 ******************************************************************************
 * The following program takes an input file and creates a an output 
 * file containing each word in the input file plus the number of times that
 * word appears in the file. This is done with two data structures- HashTable 
 * and MapTree.
 * ****************************************************************************
 Due Date : 10/24/2013 

 Certification: 
 I hereby certify that this work is my own and none of it is the work 
 of any other person. 

 * 
 * 

 ..........{ Triana Carmenate }.......... 
 */

/*
 * A method that takes an input file and sorts it using a TreeMap.
 * Results and running time are output to a file called treeOutFile.txt.
 */
public class HashMapMain {

    public static void mapSort(BufferedReader br) {

        TreeMap<String, Integer> wordCount = new TreeMap<String, Integer>();
        String test = "";
        long startTime = System.currentTimeMillis(); //Used to calculate running
        //time.
        //Adds the contents of the input file to a String
        try {
            while (br.readLine() != null) {
                test = test + br.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        //Trims null character from the input file
        if (test.endsWith("null")) {
            test = test.substring(0, test.length() - 4);
        }
        Scanner inScan = new Scanner(test);

        //Adds contents of the file to a TreeMap
        while (inScan.hasNext()) {
            String currentWord = inScan.next();
            if (wordCount.containsKey(currentWord)) {
                //Individual(unique) words are placed into the Map along with the 
                //number of times they appear in the file.
                wordCount.put(currentWord, wordCount.get(currentWord) + 1);
            } else {
                wordCount.put(currentWord, 1); //New word
            }
        }

        //Formatting Strings
        String formatStr = "%-25s %-25s";
        String line = "";

        //Inputs Map into an output file in a nice format
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("treeOutFile.txt"));
            for (String k : wordCount.keySet()) {
                line = String.format(formatStr, k, wordCount.get(k));
                bw.append(line);
                bw.newLine();
            }
            bw.append(runningTime(startTime, "TreeMap Sort")); //Running Time
            bw.close();
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /*
     * A method that takes an input file and sorts it using a Hashtable.
     * Results and running time are output to a file called hashOutFile.txt.
     */
    public static void hashTableSort(BufferedReader br) {

        Hashtable<String, Integer> wordCount = new Hashtable<String, Integer>();
        String test = "";
        long startTime = System.currentTimeMillis(); //Used to calculate 
        //running time
        //Adds the contents of the input file to a String
        try {
            while (br.readLine() != null) {
                test = test + br.readLine();

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //Trims null character from the input file
        if (test.endsWith("null")) {
            test = test.substring(0, test.length() - 4);
        }

        Scanner inScan = new Scanner(test);



        //Add contents to a Hastable
        while (inScan.hasNext()) {
            String currentWord = inScan.next();
            if (wordCount.containsKey(currentWord)) {
                wordCount.put(currentWord, wordCount.get(currentWord) + 1);
            } else {
                wordCount.put(currentWord, 1);
            }
        }

        //A Hashtable does not sort contents- so contents are placed into 
        //a collection class
        List<String> tmp = Collections.list(wordCount.keys());
        Collections.sort(tmp); //Sorts contents
        Iterator<String> iterator = tmp.iterator();

        //Used for formatting the output text file
        String element = "";
        String formatStr = "%-25s %-25s";
        String line = "";

        //Inputs Hash into an output file in a nice format
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("hashOutFile.txt"));
            while (iterator.hasNext()) {
                element = iterator.next();
                line = String.format(formatStr, element, wordCount.get(element));
                bw.append(line);
                bw.newLine();
            }
            bw.append(runningTime(startTime, "Hash Sort"));//Running Time
            bw.close();
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    /*
     * A method used to calculate the runningTime of a method
     * Supply this method with your starting time and the name of your
     * method and it will return a string with the correct information.
     */
    public static String runningTime(long startTime, String funcName) {
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        return funcName + " : Total running time is : " + totalTime + "ms";
    }

    public static void main(String[] args) {

        BufferedReader br = null;

        //Calling the TreeMap sort method
        try {
            br = new BufferedReader(new FileReader("dataSample.txt"));
            mapSort(br);
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        br = null;

        //Calling the HashTable sort method 
        try {
            br = new BufferedReader(new FileReader("dataSample.txt"));
            hashTableSort(br);
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("The program has finished running.");
    }
}