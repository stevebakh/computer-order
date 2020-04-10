/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.computerorder;

import java.util.Scanner;
/**
 *
 * @author maria
 */
public class ComputerOrder {
    public static void main (String[] args )
    {
        double size, optional;
        final double computer = 375.99;
        Scanner keyboard = new Scanner (System.in);
        System.out.println("COMPUTER ORDER"); 
        System.out.println("Basic model cost 375.99");
        System.out.println("Select screen size (1 for screen38 or 2 for screen43)");
        size = keyboard.nextDouble();
        if (size == 1)
        {
            System.out.println("Price = " + (computer + 75.99) );
        }
        if (size == 2)
        {
            System.out.println("Price = " + (computer + 99.99) );
        }
        System.out.println("You can select optional items: antivirus, printer");
        System.out.println("Select 1 for antivirus, 2 for printer, 3 for both or 0 for No, thank you");
        optional = keyboard.nextDouble();
        if (optional == 1 && size == 1)
        {
            System.out.println("Price TOTAL = " + (computer + (75.99 + 65.99)));
        }
        if (optional == 1 && size == 2)
        {
            System.out.println("Price TOTAL = " + (computer + (99.99 +65.99)));
        }
        if (optional == 2 && size == 1)
        {
            System.out.println("Price TOTAL = " + (computer + (75.99 + 125)));
        }
        if (optional == 2 && size == 2)
        {
            System.out.println("Price TOTAL = " + (computer + (99.99 + 125)));
        }
        if (optional == 3 && size == 1)
        {
            System.out.println("Price TOTAL = " + (computer + (75.99 + 65.99 + 125)));
        }
        if (optional == 3 && size == 2)
        {
            System.out.println("Price TOTAL = " + (computer + (99.99 + 65.99 + 125)));
        }
        if (optional == 0 && size == 1)
        {
            System.out.println("Price TOTAL = " + (computer + 75.99));
        }
        if (optional == 0 && size == 2)
        {
            System.out.println("Price TOTAL = " + (computer + 99.99));
        }
            
        }
        
        
                    
                }
        
        
        
           
        
        
        
        
        
              
     
      
        
        
        
                
                
                
    
    

