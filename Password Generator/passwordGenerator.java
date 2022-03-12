/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodikoigenerator;

import java.util.Random;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 *
 * @author user
 */
public class KodikoiGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("in which App are you signing up to?");
        Scanner efarmogiScanner = new Scanner(System.in);
        String efarmogiString = efarmogiScanner.next();
        
        System.out.println("which e-mail did you use for the account?");
        Scanner emailScanner = new Scanner(System.in);
        String emailString = emailScanner.next();
        
        System.out.println("what is the username you used to create your account?");
        Scanner usernameScanner = new Scanner(System.in);
        String usernameString = usernameScanner.next();
        
        System.out.println("how many characters would you like your password to have? (choose between 4 and 14)");
        Scanner arithmosGrammatonScanner = new Scanner(System.in);
        String arithmosGrammatonString = arithmosGrammatonScanner.next();
        int arithmosGrammaton = Integer.valueOf(arithmosGrammatonString);
        int misosArithmosGrammaton = arithmosGrammaton / 2;
        
        Random randomfonienta = new Random();
        String fonienta = "aeiou";
    
        Random randomSymfona = new Random();
        String symfona = "bcdfghjklmnpqrstvxz";
        
        Random randomkefalaiaSymfona = new Random();
        String kefalaiaSymfona = "BCDFGHJKLMNPQRSTVWXZ";
        
        Random randomArithmoi = new Random();
        String arithmoi = "1234567890";
        if (arithmosGrammaton > 14) {
            System.exit(0);
        } else if (arithmosGrammaton < 4){
            System.exit(0);
        } else {
            System.out.println("the account information was stored in C:\\enter\\a\\location");
            
            PrintStream o = new PrintStream(new File("C:\\enter\\a\\location" + efarmogiString + ".txt"));
            
            System.setOut(o);
            System.out.println("e-mail: "+emailString);
            System.out.println("username: "+usernameString);
            System.out.print("password: ");
            misosArithmosGrammaton = misosArithmosGrammaton -1;
            System.out.print(kefalaiaSymfona.charAt(randomkefalaiaSymfona.nextInt(kefalaiaSymfona.length())));
            
            for (int counter0 = 0; counter0 < misosArithmosGrammaton; counter0++){
                System.out.print(fonienta.charAt(randomfonienta.nextInt(fonienta.length())));
                System.out.print(symfona.charAt(randomSymfona.nextInt(symfona.length())));
            }
            
            switch (arithmosGrammaton){
                case 4:
                    System.out.print(arithmoi.charAt(randomArithmoi.nextInt(arithmoi.length())));
                    break;
                
                case 6:
                    System.out.print(arithmoi.charAt(randomArithmoi.nextInt(arithmoi.length())));
                    break;
                
                case 8:
                    System.out.print(arithmoi.charAt(randomArithmoi.nextInt(arithmoi.length())));
                    break;
                
                case 10:
                    System.out.print(arithmoi.charAt(randomArithmoi.nextInt(arithmoi.length())));
                    break;
                
                case 12:
                    System.out.print(arithmoi.charAt(randomArithmoi.nextInt(arithmoi.length())));
                    break;
                
                case 14:
                    System.out.print(arithmoi.charAt(randomArithmoi.nextInt(arithmoi.length())));
                    break;
                
                case 5:
                    System.out.print(arithmoi.charAt(randomArithmoi.nextInt(arithmoi.length())));
                    System.out.print(arithmoi.charAt(randomArithmoi.nextInt(arithmoi.length())));
                    break;
                
                case 7:
                    System.out.print(arithmoi.charAt(randomArithmoi.nextInt(arithmoi.length())));
                    System.out.print(arithmoi.charAt(randomArithmoi.nextInt(arithmoi.length())));
                    break;
                
                case 9:
                    System.out.print(arithmoi.charAt(randomArithmoi.nextInt(arithmoi.length())));
                    System.out.print(arithmoi.charAt(randomArithmoi.nextInt(arithmoi.length())));
                    break;
                
                case 11:
                    System.out.print(arithmoi.charAt(randomArithmoi.nextInt(arithmoi.length())));
                    System.out.print(arithmoi.charAt(randomArithmoi.nextInt(arithmoi.length())));
                    break;
                
                case 13:
                    System.out.print(arithmoi.charAt(randomArithmoi.nextInt(arithmoi.length())));
                    System.out.print(arithmoi.charAt(randomArithmoi.nextInt(arithmoi.length())));
                    break;
            }
        }
    }
}
