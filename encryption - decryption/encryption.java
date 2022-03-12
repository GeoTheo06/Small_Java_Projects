/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodikopoihsh2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Kodikopoihsh2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("pliktrologise to keimeno sou se agglikous xarakthres: ");
        Scanner input = new Scanner(System.in);
        
        
        char[] letters = input.nextLine().toCharArray();
        

        for (int counter = 0;  counter < letters.length; counter++){
        switch (letters[counter]) {
               case 'a':
               System.out.print("/");
               break;

               case 'b':
               System.out.print("@");
               break;
               
               case 'c':
               System.out.print("#");
               break;
               
               case 'd':
               System.out.print("$");
               break;
               
               case 'e':
               System.out.print("%");
               break;
               
               case 'f':
               System.out.print("^");
               break;
               
               case 'g':
               System.out.print("&");
               break;
               
               case 'h':
               System.out.print("*");
               break;
               
               case 'i':
               System.out.print("(");
               break;
               
               case 'j':
               System.out.print(")");
               break;
               
               case 'k':
               System.out.print("-");
               break;
               
               case 'l':
               System.out.print("_");
               break;
               
               case 'm':
               System.out.print("=");
               break;
               
               case 'n':
               System.out.print("+");
               break;
               
               case 'o':
               System.out.print("`");
               break;
               
               case 'p':
               System.out.print("~");
               break;
               
               case 'q':
               System.out.print("1");
               break;
               
               case 'r':
               System.out.print("2");
               break;
               
               case 's':
               System.out.print("3");
               break;
               
               case 't':
               System.out.print("4");
               break;
               
               case 'u':
               System.out.print("5");
               break;
               
               case 'v':
               System.out.print("6");
               break;
               
               case 'w':
               System.out.print("7");
               break;
               
               case 'x':
               System.out.print("8");
               break;
               
               case 'y':
               System.out.print("9");
               break;
               
               case 'z':
               System.out.print("0");
               break;
               
               case ' ':
               System.out.print(" ");
               break;
               
               case '?':
               System.out.print("?");
               break;
               
               case '!':
               System.out.print("!");
               break;
               
          }
        }   
    }   
}
