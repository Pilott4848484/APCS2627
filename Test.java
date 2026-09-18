/*

    @author Oleg Petrov
    - Dice project

*/

public class Test {
    
    public static void main(String[] args) {

            Dice die1 = new Dice();
            Dice die2 = new Dice();

            System.out.println("die 1:");
            System.out.println(die1.roll());
            System.out.println(die1.roll());
            System.out.println(die1.roll());

            System.out.println("die 2:");
            System.out.println(die2.roll());
            System.out.println(die2.roll());
            
            System.out.println("Die 1 was rolled "+die1.getNumRolls()+" times");
            System.out.println("Die 2 was rolled "+die2.getNumRolls()+" times");

            die1.reset();
            System.out.println("after reset:");
            System.out.println("Die 1 was rolled "+die1.getNumRolls()+" times");
            System.out.println("Die 2 was rolled "+die2.getNumRolls()+" times");
        
    }

}

