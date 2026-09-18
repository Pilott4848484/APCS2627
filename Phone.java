import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {

        String userName;
        String firstName;
        String lastName;
        String phoneNumber;
        String formattedPhoneNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        userName = scanner.nextLine();
        String[] parts = userName.split(" ", 2);
        firstName = parts[0];
        lastName = parts[1];


        System.out.print("Enter your phone number in the format xxxxxxxxxx: ");
        phoneNumber = scanner.nextLine();
        formattedPhoneNumber = "("+phoneNumber.substring(0, 3)+") "+phoneNumber.substring(3, 6)+"-"+phoneNumber.substring(6, 10);
        System.out.println(firstName+", "+lastName+"\t"+formattedPhoneNumber);
        scanner.close();
    }
}
