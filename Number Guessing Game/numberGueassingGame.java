/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.guessing.game;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.exit;



/**
 *
 * @author user
 */
public class NumberGuessingGame {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) throws IOException {
        System.out.println("");
        System.out.println("WELCOME TO THE GUESSING GAME IN WHICH YOU HAVE TO GUESS THE CORRECT NUMBER AS YOU MAY HAVE ALREADY GUESSED.");
        System.out.println("lots of guesses, huh? ;)");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.println("ANYWAY, SELECT THE LEVEL OF DIFFICULTY: ");
        System.out.println("baby | medium | hard | impossible");
        
        Scanner dyskolia = new Scanner(System.in);
        String dyskoliaString = dyskolia.next();
        
        int prospathies = 0;
        int megistosArithmos = 0;
        
        switch (dyskoliaString){
            case "baby":
               prospathies = 20;
               megistosArithmos = 1000;
               
               System.out.println("");
               System.out.println("Bruh... WHY?!");
               
               try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
               System.out.println("Anyway...");
               
               try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
               break;
               
            case "medium":
               prospathies = 15;
               megistosArithmos = 10000;
               break;
               
            case "hard":
               prospathies = 10;
               megistosArithmos = 10000;
               break;
               
            case "impossible":
               prospathies = 5;
               megistosArithmos = 10000;
               break;
            
            default:
                System.out.println("you didn't select a valid option, the program will close :(");
                
            System.in.read();
            System.exit(0);
        }
            
        System.out.println("You have " + prospathies + " attempts to find the number between 1 and " + megistosArithmos);
        
        Random randomNumber = new Random();
        int randomNumberInt = randomNumber.nextInt(megistosArithmos);
        
        for (int metritis = 1; metritis<=prospathies; metritis++) {
        Scanner epilegmenosArithmos = new Scanner(System.in);
        String epilegmenosArithmosString = epilegmenosArithmos.next();
        int epilegmenosArithmosInt = Integer.valueOf(epilegmenosArithmosString);
        
        int apomeinantesProspathies = prospathies - metritis;
        
        if (randomNumberInt == epilegmenosArithmosInt) {
            System.out.println("");
            System.out.println("");
            System.out.println("you did it! the number was indeed " + randomNumberInt);
            System.out.println("You found it within " + metritis + " attempts");
            System.out.println("");
            
            System.in.read();
            System.exit(0);
            
        } else if (randomNumberInt > epilegmenosArithmosInt) {
            System.out.println("the number you are looking for is bigger, try again ...");
            System.out.println("you have "+ apomeinantesProspathies +" attempts left");
            System.out.println("");
            
        } else if (randomNumberInt < epilegmenosArithmosInt) {
            System.out.println("the number you are looking for is smaller, try again ...");
            System.out.println("you have "+ apomeinantesProspathies +" attempts left");
            System.out.println("");
        }
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("your attemtps are over, you failed. The Number was " + randomNumberInt);
        System.out.println("Maybe you'll find the number the next time :(");
        System.out.println("");
        System.out.println("");
        
        System.in.read();
            System.exit(0);
    }
    
    }
