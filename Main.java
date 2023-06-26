// this project is a number guessing game, where it shows our too large if we give a no. greater than the random no.
// or it gives no. is too small if it is lesser than the original no.
// and if we guss the original no. it displays woohoo..
// and if the no. is negative than it displays our original no.
package org.apnacollege;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //MINI PROJECT
        Scanner sc = new Scanner (System.in);
        int myNumber = (int)(Math.random()*100);
// random() generates a no. in between the range of 0.0 till 1.
        int userNumber=0;
        do{
            System.out.println("Guess My Number(1-100): ");
            userNumber= sc.nextInt();
            if(userNumber==myNumber){
                System.out.println("WOOHOOO..CORRECT NUMBER !!");
            break;
            } else if(userNumber > myNumber){
                System.out.println("Your Number Is Too Large");
            } else{
                System.out.println("Your Number Is Too Small");
            }
        } while(userNumber >= 0);
        System.out.print("My Number Was : ");
        System.out.println(myNumber);
    }
}