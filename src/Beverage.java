import java.util.ArrayList;

/**
 * This abstract class implements Buyable and
 * represents the beverages that the user can 
 * purchase from the coffee kiosk program.
 *  
 * @author Charles Nix
 */
public abstract class Beverage implements Buyable {

    /** This constant represents size large */
    public static final int LARGE = 2;
    /** This constant represents size small */
    public static final int SMALL = 0;
    /** This array list keeps hold of any add ons added to a beverage. */
    protected ArrayList<Addition> addOns = new ArrayList<Addition>();
    /** This variable keeps hold of the size the user provided. */
    protected int size;
    
    /**
     * This abstract class will get the
     * cost of the beverages.
     */
    public abstract Money getCost();

    /**
     * This abstract class will get the
     * calories of the beverages.
     */
    public abstract int getCalories();
    
    /**
     * This method sets the size of the beverage.
     * @param size The integer representing the size.
     */
    public void setSize(int size) {
        this.size = size;
        if (size == 2) {
            size = LARGE;
        } else {
            size = SMALL;
        }
    }
    
    /**
     * This method adds the add ons to the array list and beverage.
     * @param addOn Object representing an add on.
     */
    public void addToDrink(Addition addOn) {
        addOns.add(addOn);
    } 
}
