import java.util.Scanner;

public class EncryptionTest {
    public static void main(String[] args) {
        Encryption test = new Encryption();
        System.out.println(test.getSymbol(5));

        Scanner input = new Scanner(System.in);

        System.out.println("1 - Encrypt");
        System.out.println("2 - Decrypt");
        System.out.println("3 - Terminate");
        System.out.println(" ");
        System.out.println("Enter choice:");

        int userChoice = 0;

        while (true) {
            System.out.println("1, 2, or 3");
            userChoice = input.nextInt();
            input.nextLine();

            if (userChoice == 1) {
                System.out.println("Enter the plain text message");
                String plainText = input.nextLine();
                String encryptedMessage = test.encrypt(plainText);
                System.out.println("Encrypted message: " + encryptedMessage);

            } else if (userChoice == 2) {
                System.out.println("Enter the encrypted text message");
                String encryptedText = input.nextLine();
                String decryptedMessage = test.decrypt(encryptedText);
                System.out.println("Decrypted message: " + decryptedMessage);

            } else if (userChoice == 3) {
                break;

            } else {
                System.out.println("Error: Please enter valid input");
            }

        }
        input.close();
    }
}
