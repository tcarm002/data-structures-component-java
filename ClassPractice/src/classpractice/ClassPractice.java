/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classpractice;

/**
 *
 * @author sol
 */
public class ClassPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
        System.out.println("");
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setQuackBehavior(new MuteQuack());
        modelDuck.performQuack();
        
        
    }
}
