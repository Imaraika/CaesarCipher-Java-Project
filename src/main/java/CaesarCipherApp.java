import java.util.ArrayList;
import java.util.Scanner;
public class CaesarCipherApp {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String for Encryption: ");
        String message = new String();
        message = sc.next();
        Encryption encrypty = new Encryption();
        String pingPongResult = encrypty.encrypt(message, 3);
        Decryption decrypt = new Decryption();
        String pingPongResult2 = decrypt.decrypt(message, 3);

        System.out.println(pingPongResult);
        System.out.println(pingPongResult2);
        sc.close();
    }


}
