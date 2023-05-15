/** 
 * This interface sets the getCost() method to
 * be used in the numerous beverage and mug classes.
 * 
 * @author Charles Nix
 */
public interface Buyable {
    /*
     * This abstract method gets the cost of a beverage or mug.
     */
    public abstract Money getCost();
    
}
