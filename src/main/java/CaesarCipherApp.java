import java.util.ArrayList;
import java.util.Scanner;
public class CaesarCipherApp {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input the plaintext message : ");
        String plaintext = sc.nextLine();
        System.out.println(" Enter the value by which each character in the plaintext message gets shifted : ");
        int shift = sc.nextInt();
        Encryption encrypty = new Encryption();
        String pingPongResult = encrypty.encrypt(plaintext,shift);
        System.out.println(pingPongResult);
        Scanner scd = new Scanner(System.in);
        System.out.println(" Input the CipherText message : ");
        String cipherText = scd.nextLine();
        System.out.println(" Enter the key: ");
        int shiftkey = scd.nextInt();
        Decryption decrypt = new Decryption();
        String pingPongResult2 = decrypt.decrypt(cipherText, shiftkey);


        System.out.println(pingPongResult2);
        sc.close();
    }


}
