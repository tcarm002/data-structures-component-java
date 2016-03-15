/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classpractice;

/**
 *
 * @author sol
 */
public class ModelDuck extends Duck {
    
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    
    public void display(){
        System.out.println("I am a model duck");
    }
    
}
