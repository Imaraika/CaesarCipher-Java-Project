import java.util.ArrayList;
import java.util.Scanner;
public class CaesarCipherApp {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input the plaintext message : ");
        String plaintext = sc.nextLine();
        System.out.println(" Enter any Key value you want Please  : ");
        int shiftky = sc.nextInt();
        Encryption encrypty = new Encryption();
        String encryptionResult = encrypty.encrypt(plaintext,shiftky);
        System.out.println(encryptionResult);
        Scanner scd = new Scanner(System.in);
        System.out.println(" Input the CipherText message : ");
        String cipherText = scd.nextLine();
        System.out.println(" Enter the same key value as the above: ");
        int shiftkey = scd.nextInt();
        Decryption decrypt = new Decryption();
        String decryptionResult = decrypt.decrypt(cipherText, shiftkey);
        System.out.println(decryptionResult);
        sc.close();
    }


}
