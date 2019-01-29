/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPattern.Decorator;

/**
 *
 * @author nikhil.agrawal
 */
public class ChickenTikkaPizza extends PizzaDecorator {
   
    public ChickenTikkaPizza(Pizza newPizza) {
//        Pizza p = newPizza;
        super(newPizza);
    }

    @Override
    public String bakePizza() {
        return pizza.bakePizza() + " with Chicken topping added";
    }

    @Override
    public String serve(int customerID){
        return ("Serving chickenTikka Pizaa to customer :: " + customerID + " with cost :: "+ cost());
    }

    public int cost() {
        return 250;
    }   
    
}