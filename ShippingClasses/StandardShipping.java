/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShippingClasses;

/**
 *
 * @author rique
 */
public class StandardShipping implements ShippingCharges {
    final private double SHIPPING_CHARGE = 5;

    public double getSHIPPING_CHARGE() {
        return SHIPPING_CHARGE;
    }
    
    @Override
    public double shipCost(){
        return SHIPPING_CHARGE;
    }
}
