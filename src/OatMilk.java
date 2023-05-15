/**
 * This class represents the oat milk add on
 * that can be added to a beverage. 
 * 
 * @author Charles Nix
 */
public class OatMilk extends Addition {

    /**
     * This method gets the cost of the oat milk add on.
     * @return the cost of the oat milk add on.
     */
    public Money getCost() {
        return Money.ONE_DOLLAR;
    }
    
    /**
     * This method gets the calories of the oat milk add on.
     * @return the calories of the oat milk add on.
     */
    public int getCalories() {
        return 30;
    }
    
    /**
     * This method creates a string for displaying oat milk.
     * @return String for displaying oat milk.
     */
    public String toString() {
        return "Oatmilk";
    }
}
