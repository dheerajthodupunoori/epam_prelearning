/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_07_multiplication;

/**
 *
 * @author Daniel Pasztuhov
 */
public class Multiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                //System.out.print(i*j + " ");
                System.out.printf("%3d", i*j); // %3d-t magyarázni
            }
            System.out.println();
        }
    }
    
}
