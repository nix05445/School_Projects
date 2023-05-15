/**
 * This class represents the sugar syrup
 * add on that can be added to a beverage. 
 * 
 * @author Charles Nix
 */
public class SugarSyrup extends Addition {

    /**
     * This method gets the cost of the sugar syrup add on.
     * @return the cost of the sugar syrup add on.
     */
    public Money getCost() {
        return new Money(50);
    }
    
    /**
     * This method gets the calories of the sugar syrup add on.
     * @return the calories of the sugar syrup add on.
     */
    public int getCalories() {
        return 60;
    }
    
    /**
     * This method creates a string for displaying sugar syrup.
     * @return String for displaying sugar syrup.
     */
    public String toString() {
        return "Sugar Syrup";
    }
}
