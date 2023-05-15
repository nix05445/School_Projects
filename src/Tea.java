/**
 * This class represents tea that
 * the user can purchase from the
 * coffee kiosk program.
 * 
 * @author Charles Nix
 */
public class Tea extends Beverage {

    /**
     * This method gets the cost of a small or large tea
     * with or without add ons.
     * 
     * @return cost of tea based on its size and add ons.
     */
    public Money getCost() {
        Money getTeaCost = new Money(150);
        
        for (int i = 0; i < super.addOns.size(); i++) {
            getTeaCost = getTeaCost.add(super.addOns.get(i).getCost());
        }
        
        return getTeaCost;
    }
    
    /**
     * This method gets the calories of a small or large tea
     * with or without add ons.
     * 
     * @return calories of tea based on its size and add ons.
     */
    public int getCalories() {
        int teaCalories = 5;
        
        for (int i = 0; i < super.addOns.size(); i++) {
            teaCalories = teaCalories + super.addOns.get(i).getCalories();
        }
        
        return teaCalories;
    }
    
    /**
     * This method will create a display for tea.
     * It will include add ons, size, and calories.
     * 
     * @return String for displaying tea.
     */
    public String toString() {
        String cupSize = "S";
        String addOns = "";
        
        if (super.size == 2) {
            cupSize = "L";
        }
        
        for (int i = 0; i < super.addOns.size(); i++) {
            addOns = addOns + "+" + super.addOns.get(i).toString();
        }
        return "Tea" + addOns + " (" + cupSize + ") - " + getCalories() + " calories";
    }
    
}
