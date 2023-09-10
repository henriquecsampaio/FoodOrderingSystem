/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShippingClasses;

/**
 *
 * @author rique
 */
public class ExpressShipping extends StandardShipping {
    final public double EXPRESS_SHIPPING = 7;
    
    @Override
    public double shipCost(){
        return EXPRESS_SHIPPING + getSHIPPING_CHARGE();
    }
}
