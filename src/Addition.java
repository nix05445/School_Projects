/**
 * This class extends the Beverage class and sets 
 * the getCost() and getCalories() methods for
 * the add ons.
 * 
 * @author Charles Nix
 */
public abstract class Addition extends Beverage {
    
    /*
     * This abstract method gets the cost of an add on.
     */
    public abstract Money getCost();
    
    /*
     * This abstract method gets the calories of add on.
     */
    public abstract int getCalories();
    
}
