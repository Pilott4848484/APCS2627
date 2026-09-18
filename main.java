import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*

Created by pilott <3

*/

public class main {

    public static String formatListWithPadding(List<String> list, int w, int y) {
        StringBuilder sb = new StringBuilder("[ ");
        int itemsToPrint = Math.min(w, list.size());
        int columnWidth = 8; 
        for (int i = 0; i < itemsToPrint; i++) {
            sb.append(centerString(list.get(i), columnWidth)).append(" | ");
        }
        if (w < y) {
            int totalPaddingNeeded = y - itemsToPrint;
            for (int i = 0; i < totalPaddingNeeded; i++) {
                sb.append(centerString("?", columnWidth));
                if (i < totalPaddingNeeded - 1) {
                    sb.append(" | ");
                }
            }
        } else {
            if (itemsToPrint > 0) {
                sb.setLength(sb.length() - 3);
            }
        }
        sb.append(" ]");
        return sb.toString();
    }
    private static String centerString(String s, int width) {
        if (s.length() >= width) {
            return s;
        }
        int padding = width - s.length();
        int leftPadding = padding / 2;
        int rightPadding = padding - leftPadding;
        return " ".repeat(leftPadding) + s + " ".repeat(rightPadding);
    }
    public static void main(String[] args) {
        
        int roundLength; // WHEN YOU START, TYPE DESIRED ROUND LENGTH AND PRESS 'ENTER'

        List<String> choices = List.of("Verity", "Lovity", "Falsity", "Cruelty", "Obesity");
        List<String> selected = new ArrayList<>();

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter round length: ");
        int r = Integer.parseInt(scanner.nextLine());
        if (r<=0){
            r++;
        }
        roundLength = r;

        for (int i = 0; i < roundLength; i++) {
            String item = choices.get(random.nextInt(choices.size()));
            selected.add(item);
            //System.out.println(item); //run to see what was chosen
        }
        int m = 0;
        int w = 0;
        System.out.println("Current Guesses: "+formatListWithPadding(selected, w, roundLength)); 
        while (w < roundLength) {
            System.out.print("Enter your guess: ");
            String name = scanner.nextLine();
            System.out.println("\n\n\n\n\n\n");
            if (name.equalsIgnoreCase(selected.get(w))) {
                if (((roundLength-w)-1) == 0) {
                    System.out.println("Correct!");
                } else {
                    if (((roundLength-w)-1) == 1) {
                        System.out.println("Correct!"+"\n"+((roundLength-w)-1)+" Card left!");
                    } else {
                        System.out.println("Correct!"+"\n"+((roundLength-w)-1)+" Cards to go!");
                    }
                }
                
                w++;
            } else {
                m++;
                System.out.println("Wrong Answer!"+"\nTotal Mistakes: "+m+"\nPrevious Guess: "+name);
                //System.out.println("You said: "+name.toLowerCase()+" | Correct Answer: "+selected.get(w).toLowerCase());
            }

            System.out.println("Current Stack: "+formatListWithPadding(selected, w, roundLength)); 
        }

        System.out.println("\nYou Win!");
        System.out.println("Total Mistakes: "+m);
        System.out.println("\nthanks for playing!\n\t- Pilott\n");

        scanner.close();
    }
}