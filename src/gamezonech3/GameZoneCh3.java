/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezonech3;

import java.util.Random;

/**
 *
 * @author ikoal
 */
public class GameZoneCh3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card card1 = new Card();
        Card card2 = new Card();
        Random rand = new Random();
        
        int num1 = rand.nextInt(13) + 1;
        int num2 = rand.nextInt(13) + 1;
        // TODO code application logic here
        card1.setSuit("heart");
        card1.setNumber(num1);
        card2.setSuit("spades");
        card2.setNumber(num2);
        System.out.println("Your cards are " + card1.getNumber() + " of " + card1.getSuit() + " and " + card2.getNumber() + " of " + card2.getSuit());
        
    }
    
}
