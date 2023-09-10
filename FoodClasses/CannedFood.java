/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectoop.FoodClasses;

import java.time.LocalDate;

/**
 *
 * @author rique
 */
public class CannedFood extends Food {
    
    final private double TAX = 0.07;
    private int quantity;
    private double unitPrice;

    public CannedFood( String itemName, String shelfLife, String quantity, String unitPrice) {
        super(itemName, shelfLife);
        this.quantity =  Integer.parseInt(quantity);
        this.unitPrice = Double.parseDouble(unitPrice);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    
    
    
    @Override
    public double calculateCost(){
        return quantity * unitPrice * (1 + TAX);
    }
    
    @Override
    public LocalDate expiresOn(){
        setExpiryDate(LocalDate.now().plusYears(getShelfLife()));
        return getExpiryDate();
    }
    
    @Override
    public String toString(){
         
        String formattedCalculateCost = String.format("%.2f", calculateCost());
        String output = "CannedFood" + " " + getItemName()
                + " costs $" + formattedCalculateCost 
                + "\nIt is good until " + expiresOn() + "\nShelf life is " +
                getShelfLife() + " years\n--------------------\n";
        
        return output;
                
    }

}