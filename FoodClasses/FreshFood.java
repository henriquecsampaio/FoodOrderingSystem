/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectoop.FoodClasses;

/**
 *
 * @author rique
 */
public class FreshFood extends Food {
    private double weight;
    private double weightCost;

    public FreshFood( String itemName, String shelfLife, String weight, String weightCost) {
        super(itemName, shelfLife);
        this.weight =  Double.parseDouble(weight);
        this.weightCost = Double.parseDouble(weightCost);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeightCost() {
        return weightCost;
    }

    public void setWeightCost(double weightCost) {
        this.weightCost = weightCost;
    }
    
    @Override
    public double calculateCost(){
        return weight * weightCost;
    }
    
    @Override
    public String toString(){
        
        String formattedCalculateCost = String.format("%.2f", calculateCost());
        String output = "FreshFood" + " " + getItemName()
                + " costs $" + formattedCalculateCost
                + "\nIt is good until " + expiresOn() + "\nShelf life is " +
                getShelfLife() + " days\n--------------------\n";
        
        return output;
    }
}
