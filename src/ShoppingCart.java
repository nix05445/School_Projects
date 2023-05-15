import java.util.ArrayList;

/**
 * This class keeps track of the cart and adding
 * items to it. This class will also add up the
 * total cost of the cart including tax when the
 * user checks out.
 * 
 * @author Charles Nix
 */
public class ShoppingCart {

    /** This array list holds all the Buyable items the user purchases. */
    private ArrayList<Buyable> items = new ArrayList<Buyable>();
    
    /**
     * This method adds items to the
     * array list of Buyable items.
     * 
     * @param item purchased from the user.
     */
    public void addItem(Buyable item) {
        items.add(item);
    }
    
    /**
     * This method gets the total cost of the items
     * in the cart including tax.
     * 
     * @return Total cost of the cart plus sales tax.
     */
    public Money getTotal() {
        Money totalCost = new Money(0);
        
        for (int i = 0; i < items.size(); i++) {
            totalCost = totalCost.add(items.get(i).getCost());
        }
        
        return totalCost.add(Money.computeMNSalesTax(totalCost));
    }
    
    /**
     * This method creates a string for 
     * displaying items in the cart.
     * 
     * @return Display of items in the cart if any, and the total cost of the items plus sales tax.
     */
    public String toString() {
        if (items.size() == 0) {
            return "Cart is empty";
        }
        
        String theCart = "";
        for (int i = 0; i < items.size(); i++) {
            theCart = theCart + (i + 1) + ".) " + items.get(i).toString() + ": " + items.get(i).getCost() + "\n"; 
        }
        
        return theCart + "Total: " + getTotal();
    } 
}
