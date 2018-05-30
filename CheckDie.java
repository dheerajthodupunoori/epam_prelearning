/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkdie;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class CheckDie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int die_value;
        do
        {
            System.out.println("please give the die value:");
            die_value = input.nextInt();
            if(die_value<1 || die_value>6)
            {
                System.out.println("Bad value of die");
            }
            
        }while(die_value<1 || die_value>6);
        
        
        
    }
    
}
