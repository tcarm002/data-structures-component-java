/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package temp;

/**
 *
 * @author sol
 */
public class Temp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        for(int i = 1 ; i< 100; i++)
        {
            if( (i % 3 ) == 0){
                System.out.println("fizz");
                if(i % 5 == 0)
                    System.out.print("buzz\n");
        }
            else if( (i % 5) == 0 ){
                System.out.println("buzz");
            }
            
            
           else System.out.println(i);
        }
        
        
        
        
        
        
        
        
        
        
    }
}
