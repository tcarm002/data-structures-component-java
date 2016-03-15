/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classpractice;

/**
 *
 * @author sol
 */
public class MallardDuck extends Duck {
    
    public MallardDuck(){
        
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    
    public void display()
    {
        System.out.println("Im a mallard duck.");
    }
}
