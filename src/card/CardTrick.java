/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */


/** Gabriel Sackitey

Student ID: 991660150 **/

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(generateRandomValue());
            c.setSuit(Card.SUITS[generateRandomSuit()]);
            magicHand[i]=c;
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Card luckCard = new Card();
        luckCard.setValue(2);
        luckCard.setSuit("Clubs");
         magicHand[0] = luckCard;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a card!");
        System.out.print("Enter the card value (1-13): ");
        int userValue = scanner.nextInt();
        scanner.nextLine();
         System.out.print("Enter the card suit (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = scanner.nextLine();
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        // and search magicHand here
        boolean cardFound = false;
        for (Card c : magicHand) {
            if (c.getValue() == userCard.getValue() && c.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                cardFound = true;
                break;
            }
        }
        //Then report the result here
        if (cardFound) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry! Your card is not in the magic hand.");
        }
    }
       private static int generateRandomValue() {
        return (int) (Math.random() * 13) + 1;
    }
          private static int generateRandomSuit() {
        return (int) (Math.random() * 4);
    }
        // add one luckcard hard code 2,clubs
    }
    

