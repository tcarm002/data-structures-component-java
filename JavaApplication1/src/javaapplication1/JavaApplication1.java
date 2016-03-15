/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sol
 */
public class JavaApplication1 {
    
    
    
    public static void removeEven( List<Integer> lst)
    {
        int i = 0;
        while (i <lst.size())
        {
            if ( lst.get(i) % 2 ==0)
                lst.remove(i);
            else 
                i++;
        }
    }
    
    
    int arrayMethod(int row, int col)
    {
        int array[][] = new int[row][col];
        int total = 0;
        int total2 = 0;
        for ( int x = 0; x<row; x++)
        {
            for(int y = 0; y<col; y++)
            {
                array[x][y] = x+y;
                System.out.print(array[x][y] + "\t");
                if(y==5)
                {
                    total += array[x][y];
                }
                if (y==0)
                {
                    total += array[x][y];
                }
                if (x ==7)
                    
                {
                    total -= array[x][y];
                }
            }
            System.out.println("");
            System.out.println("");
        }
        
        return total;
        
        
    }
    int binarySearch( Integer array[], Integer number )
    {
        double low = 0, high = array.length - 1;
        int counter = 0;
        
        while ( low <= high )
        {
            counter++;
            System.out.println("Counter: " + counter);
            
            double mid = Math.ceil( (low + high) / 2 );
                
            System.out.println("Mid: " + mid);
            
            if ( array[(int)mid].compareTo( number ) < 0 )
            {  low = mid + 1;
                System.out.println("low: " + low);}
            else if( array[ (int)mid ].compareTo(number)>0)
            {   high = mid - 1;
                System.out.println("high: " + high);}
            else
                return counter;
                
        }
        
        return -1;
    }
    
//    
//    int factorial(int n)
//    {
//        if (n <=1)
//            return 1;
//        
//        
//        int prevAnswer = factorial(n-1);
//        int answer = n * prevAnswer;
//        
//        while ( answer / n == prevAnswer )
//        {
//                 return answer ;        
//        }
//        System.out.println("error : " + n);
//        return n;
//       
//           
//                
//        
//    }
    
    int factorial(int x)
    {
        if( x<=1 )//base
            return 1;
        
        int prevAnswer = factorial(x-1);
        int answer = x * prevAnswer;
        
        while( answer/x == prevAnswer )
        {   
            System.out.println("Factorial at " + x + " : " + answer);
            return answer;
        }
        
        System.out.println("Fails at : " + x);
        return 0;
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
//        Integer array[] = new Integer[1000000] ;
//        Integer counter = 1;
//        for(int x = 0; x < 1000000; x++ )
//        {
//            array[x] = counter;
//            counter ++;
//            
//        }
//        
//        System.out.println(new JavaApplication1().binarySearch(array,125 ));
//        
        
//        Integer myArr[] = new Integer[1000000];
//        
//        double low = 0;
//        double high = myArr.length -1 ;
//        double mid = Math.ceil( low + high ) / 2 ;
//        System.out.println( (int)mid );
//        
        
//        System.out.println(myArr.length -1 );
//        System.out.println(myArr[0]);
//        System.out.println(new JavaApplication1().arrayMethod(10, 10) );
        
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.
        
       new JavaApplication1().factorial(15);
    }
}
