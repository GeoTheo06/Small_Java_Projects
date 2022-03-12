/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.util.Scanner;

/**
 *
 * @author theod
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("make a Math operation using the symbols: *, /, +, -");
        Scanner sInput = new Scanner(System.in);
        char[] cCalculation = sInput.nextLine().toCharArray();
        int number1 = cCalculation[0] - '0';
        char symbol = cCalculation[1];
        int number2 = cCalculation[2] - '0';
        
        switch (symbol) {
            
            case '*':
                long result1 = number1 * number2;
                System.out.println(result1);
                break;
                
            case '/':
                long result2 = number1 / number2;
                System.out.println(result2);
                break;
                
            case '+':
                long result3 = number1 + number2;
                System.out.println(result3);
                break;
                
            case '-':
                long result4 = number1 - number2;
                System.out.println(result4);
                break;
                
            default:
                System.out.println("You made a mistake. Try again. (numbers have to be close to each other)");
                break;
        }
        
    }
    
}
