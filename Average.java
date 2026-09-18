import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        String course;
        String a1;
        String a2;
        String a3;
        int pe = 0;
        int pp = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Course name: ");
        course = scanner.nextLine()+"";
        

        System.out.print("First assesment name: ");
        a1 = scanner.nextLine()+"";
        
        System.out.print("Points earned on first assignment: ");
        pe += Integer.parseInt(scanner.nextInt()+"");

        System.out.print("Points possible on first assignment: ");
        pp += Integer.parseInt(scanner.nextInt()+"");

        scanner.nextLine();
        System.out.print("Second assesment name: ");
        
        a2 = scanner.nextLine()+"";
        
        System.out.print("Points earned on second assignment: ");
        pe += Integer.parseInt(scanner.nextInt()+"");

        System.out.print("Points possible on second assignment: ");
        pp += Integer.parseInt(scanner.nextInt()+"");

        scanner.nextLine();
        System.out.print("Third assesment name: ");
        a3 = scanner.nextLine()+"";
        
        System.out.print("Points earned on third assignment: ");
        pe += Integer.parseInt(scanner.nextInt()+"");

        System.out.print("Points possible on third assignment: ");
        pp += Integer.parseInt(scanner.nextInt()+"");

        System.out.println("\n");
        System.out.println(course+" Score for "+a1+", "+a2+", and "+a3+": "+pe+"/"+pp);
        System.out.println("Student average: "+String.format("%.3f",(pe+0.0)/(pp+0.0)));

        scanner.close();
    }
}
