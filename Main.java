/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_03_until_6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Daniel Pasztuhov
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generator = new Random(); // volt már random?
        int die = generator.nextInt(6)+1;
        int count = 0;
        while (die != 6) {
            System.out.println(die + " is rolled.");
            count++;
            die = generator.nextInt(6)+1;
        }
        System.out.println("You had to roll " + count + " times before getting a 6.");
    }
    
}
