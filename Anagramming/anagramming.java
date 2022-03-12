/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagrammatismos;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Anagrammatismos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // pairnei tis lekseis poy eisagei o xrhsths
        Scanner eisodos = new Scanner(System.in);
        
        System.out.println("write a sentence: ");
         char[] grammata = eisodos.nextLine().toCharArray();
        
        System.out.println("the anagramming is: ");
        
        for(int metritis = grammata.length - 1; metritis >= 0; metritis--){
            
                System.out.print(grammata[metritis]);
        }
        System.out.print("\n");
        
        }
    }
