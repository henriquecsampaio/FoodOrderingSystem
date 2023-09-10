/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShippingClasses;

import finalprojectoop.FoodClasses.*;
import java.util.Scanner;

/**
 *
 * @author rique
 */

public class ShippingOrder{
    
    private StandardShipping shipping = new StandardShipping();
    private ExpressShipping expressShipping = new ExpressShipping();
    private double shippingPrice;
    private Food[] foodItems = new Food[50];

    public ShippingOrder() {
        
    }

    public StandardShipping getShipping() {
        return shipping;
    }

    public void setShipping(StandardShipping shipping) {
        this.shipping = shipping;
    }

    public Food[] getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(Food[] foodItems) {
        this.foodItems = foodItems;
    }
   
    public void getOrder(Scanner keyboard){
        System.out.println("*****Welcome*****");
        System.out.println("How many items would you like to order?");
        int orderSize = keyboard.nextInt();
        keyboard.nextLine();
        for (int i = 0; i < orderSize; i++){
            String answer;
            String[] stringArray = new String[4];
            System.out.println("Enter the type of food item you are "
                    + "buying: Canned or fresh");
            String foodType = keyboard.nextLine();
            
            if("Canned".equalsIgnoreCase(foodType)){
                System.out.println("Enter the name, shelf life in years, "
                        + "quantity and unity price");
                answer = keyboard.nextLine();
                stringArray = answer.split("\\s+");
                foodItems[i] = new CannedFood(stringArray[0], stringArray[1], 
                        stringArray[2], stringArray[3]);
            }else if("Fresh".equalsIgnoreCase(foodType)){
                System.out.println("Enter the name, shelf life in days, "
                        + "weight in pounds and cost per pound");
                answer = keyboard.nextLine();
                stringArray = answer.split("\\s+");
                foodItems[i] = new FreshFood(stringArray[0], stringArray[1], 
                        stringArray[2], stringArray[3]);
            }
        }
        
        System.out.println("Choose shipping option: (a) Standard Shipping"
                    + " (b) Express Shipping");
            String shippingType = keyboard.nextLine();
            
            if("a".equalsIgnoreCase(shippingType)){
                shippingPrice = shipping.shipCost();
            }else if("b".equalsIgnoreCase(shippingType)){
                shippingPrice = expressShipping.shipCost();
            }
    }
    
    public double orderCost(){
        
        double totalCost = 0;
        
        for (Food foodItem : foodItems) {
            if(foodItem == null){
                break;
            }
            totalCost += foodItem.calculateCost();
        }
        
        totalCost += shippingPrice;
        
        return totalCost;
    }
    
    @Override
    public String toString(){
       String output ="";
       String formattedOrderCost = String.format("%.2f", orderCost());
       
        for (Food foodItem : foodItems) {
            if(foodItem == null){
                break;
            }
            output += foodItem;
        }
        
       output += "\nTotal amount of the order including shipping is $" + formattedOrderCost;
               
       
       return output;
    }
    
    
}
