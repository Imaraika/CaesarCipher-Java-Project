public class Encryption {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String plainText, int shiftKey)
    {
        plainText = plainText.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(plainText.charAt(i));
            int keyValue = (shiftKey + charPosition) % 26;
            char replaceKeyVal = ALPHABET.charAt(keyValue);
            cipherText += replaceKeyVal;
        }
        return cipherText;
    }

}
