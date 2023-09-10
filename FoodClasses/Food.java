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
abstract public class Food {
    
    private String itemName;
    private int shelfLife;
    private LocalDate expiryDate;

    public Food(String itemName, String shelfLife) {
        this.itemName = itemName;
        this.shelfLife = Integer.parseInt(shelfLife);
        this.expiryDate = LocalDate.now();
    }
    
    

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
    
    abstract public double calculateCost();
    
    public LocalDate expiresOn(){
        setExpiryDate(LocalDate.now().plusDays(getShelfLife()));
        return getExpiryDate();
    }
    
    @Override
    public String toString(){
       
        String output = getItemName() + " costs " + calculateCost() 
                + "\nIt is good until " + getExpiryDate() + "\nShelf life is " +
                getShelfLife() + "--------------------";
        
        return output;
                
    }
    
}
