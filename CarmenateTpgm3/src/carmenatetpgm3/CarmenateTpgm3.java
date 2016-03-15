/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carmenatetpgm3;

import java.util.ArrayList;

/**
 *
 * @author sol
 */
public class CarmenateTpgm3 {

    /**
     * Simple insertion sort. Credit: Data Structures and Algorithms by Mark
     * Weiss
     *
     * @param a an array of Comparable items.
     */
    public static String[] insertionSort(String[] a) {
        int j;
        for (int p = 1; p < a.length; p++) {
            String tmp = a[ p];
            for (j = p; j > 0 && tmp.compareTo(a[ j - 1]) < 0; j--) {
                a[ j] = a[ j - 1];
            }
            a[ j] = tmp;
        }
        return a;
    }

    /**
     * @param args the command line arguments
     */
    
    public static int[] bucketSort(int[] a){
        
        //find highest int, make array of index of this number, fill with zeros
        
        int highest = a[0];
        for(int x = 0; x < a.length; x++){
            if( a[x] > highest ){
                highest = a[x] ;
            }
        }
            
        int[] temp = new int[highest + 1];
        
        //fill with zeroes
        for(int y = 0; y < temp.length; y++)
        {
            temp[y] = 0;
        }

        //increase by +1 when item of given index is found
        for(int z = 0; z < temp.length; z++ )
        {
            for(int y = 0; y < a.length; y++)
            {
                if(z == a[y]){
                    temp[z]++;
                }
            }
        }
        
        //print items >0
        for( int x = 0; x < temp.length; x++){
            if(temp[x]>0){
            int numTimes = temp[x];
            
            }
        }
        return temp;
    }
    
    public static void main(String[] args) {

      int[] myArr = new int[4];

//      myArr[0]= "e";
//      myArr[1]= "f";
//      myArr[2]= "g";
//      myArr[3]= "a";
      
      myArr[0]= 6;
      myArr[1]= 100;
      myArr[2]= 0;
      myArr[3]= 0;
     //   System.out.println(myArr.length);
      bucketSort(myArr);
      
        //String[] newArr =  insertionSort(myArr) ;
      
//        for(int i = 0; i < newArr.length; i++)
//        {
//            System.out.println(newArr[i]);
//        }
//
//        
        
        
    }
}
