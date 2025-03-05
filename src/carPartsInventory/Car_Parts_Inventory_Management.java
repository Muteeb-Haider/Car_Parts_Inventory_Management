/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carPartsInventory;

import java.util.ArrayList;
import java.util.List;

/**
 * The main class to demonstrate inventory management of car parts.
 */
public class Car_Parts_Inventory_Management {
  /**
     * The main method where execution begins.
     * Initializes car parts, adds them to inventory, and demonstrates various operations.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        
         CarPart c = new CarPart(1200,70,"Engine"); 
         CarPart p = new CarPart(1300,80,"Engine"); 
         CarPart r = new CarPart(1400,90,"Engine"); 
         CarPart q = new CarPart(1500,95,"Engine"); 
         CarPart a = new CarPart(1200,70,"Brake"); 
         CarPart b = new CarPart(1300,80,"Brake"); 
         CarPart e = new CarPart(1400,90,"Brake"); 
         CarPart d = new CarPart(1500,95,"Brake"); 
         List<CarPart> cp = new ArrayList<>();
         cp.add(c);
         cp.add(p);
         cp.add(r);
         cp.add(q);
         cp.add(a);
         cp.add(b);
         cp.add(e);
         cp.add(d);
         
         Inventory in = new Inventory(cp);
         
         System.out.println(in.count("Engine"));
         System.out.println(in.count("Brake"));
         System.out.println(in.replace("Engine"));
         System.out.println(in.cheapestPart("Engine"));
         System.out.println(in.totalValue());
         System.out.println(in.totalValuePart("Engine"));
         System.out.println(in.totalValuePart("Brake"));
         
    }   
   
    
    }
    

