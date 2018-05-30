/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boiling;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Boiling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        System.out.println("Give the temperature value:");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        if(value >= 100)
        {
            System.out.println("water is boiling");
        }
        else
        {
            System.out.println("water is not boiling");
        }
        
    }
    
}
