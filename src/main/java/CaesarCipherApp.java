import java.util.ArrayList;
import java.util.Scanner;
public class CaesarCipherApp {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input the plaintext message : ");
        String plaintext = sc.nextLine();
        System.out.println(" Enter the value by which each character in the plaintext message gets shifted : ");
        int shift = sc.nextInt();;
//        Encryption encrypty = new Encryption();
//        String pingPongResult = encrypty.encrypt(plaintext, 3);
        Decryption decrypt = new Decryption();
        String pingPongResult2 = decrypt.decrypt(plaintext, 3);

//        System.out.println(pingPongResult);
        System.out.println(pingPongResult2);
        sc.close();
    }


}
