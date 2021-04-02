/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author QUAZI HASNAT IRFAN
 */
public class Super_Class {
    
    public double kachchi;
    public double fried;
    public double bhuna;
    public double french;
    public double grilled;
    public double pizza;
    public double cheese;
    
    public double milk;
    public double hot;
    public double falooda;
    public double sweet;
    public double soup;
    public double vanilla;
    public double lemon;
    
    public double meal;
    public double drink;
    public double total_md;
    public double grandTotal;
    
    public double getAmount(){
        
        meal = kachchi + fried + bhuna + french + grilled + pizza + cheese;
        
        drink = milk + hot + falooda + sweet + soup + vanilla + lemon;
        
        total_md = meal + drink;
        
        grandTotal = total_md;
        
        return grandTotal;
    }
    
    private JFrame f;
    
    public void Exit(){
        
        if(JOptionPane.showConfirmDialog(f, "Do you want to Exit ?", "Restaurant Management System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            
            System.exit(0);
        }
    }
    
    public double pkachchi = 170;
    public double pfried = 230;
    public double pbhuna = 90;
    public double pfrench = 130;
    public double pgrilled = 210;
    public double ppizza = 700;
    public double pcheese = 220;
    
    public double pmilk = 190;
    public double phot = 400;
    public double pfalooda = 150;
    public double psweet = 110;
    public double psoup = 80;
    public double pvanilla = 115;
    public double plemon = 50;
    
    public double taxPercent = 0.40;
    
    public double findTax(double cAmount){
        
        double tax = cAmount - (cAmount * taxPercent);
        return tax;
    }
}
