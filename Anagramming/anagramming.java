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
        
        
        /**αυτος ειναι ενας πινακας που αποθηκευει δεδομενα ανα χαρακτηρες, για
         * να φτιαξουμε εναν πινακα πρεπει πρωτα να δηλώσουμε τι είδους πινακας 
         * ειναι, π.χ. αυτος ειναι ενας πίνακας που συλλέγει δεδομενα χαρακτήρων
         * : char. Για να δηλώσουμε εναν πίνακα πρέπει να βάλουμε τα [] και το 
         * nextLine().toCharArray(), μετα του βάζουμε ενα ονομα όπως εδω: "grammata" και 
         * τέλος του λέμε με τι ισούται. Εδω πέρα το "eisodos.nextLine().toCharArray();" 
         * δείχνει οτι ο πίνακας τρέχει το "eisodos" πιο πανω το οποιο συλλέγγει
         *δεδομενα απο τον χρηστη, το toCharArray() μεταφερει την φραση που 
         * εισαγει σε εναν πινακα χαρακτηρων**/
         char[] grammata = eisodos.nextLine().toCharArray();
        
        System.out.println("the anagramming is: ");
        
        // pairnei ena ena ta grammata ta opoia einia apoyhikeymena sto "grammata" kai meta ta meionei kata 1 mexri na ftasei sto gramma 0
        for(int metritis = grammata.length - 1; metritis >= 0; metritis--){
            
            //opote meta ta ektyponei anapoda
                System.out.print(grammata[metritis]);
        }
        
        //allazei grammh gia na mhn einia kollhta to "BUILD SUCCESFULL"
        System.out.print("\n");
        
        }
    }
