/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalprojectoop;

import ShippingClasses.*;
import finalprojectoop.FoodClasses.*;
import java.util.Scanner;

/**
 *
 * @author rique
 */
public class FinalProjectTester {

    public FinalProjectTester(){
        ShippingOrder orders = new ShippingOrder();
        Scanner keyboard = new Scanner(System.in);
        orders.getOrder(keyboard);
        orders.orderCost();
        System.out.println(orders.toString());
    }
    
    
    public static void main(String[] args) {
        new FinalProjectTester();
    }
    
}
