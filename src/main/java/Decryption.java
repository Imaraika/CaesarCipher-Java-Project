public class Decryption {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String decrypt(String cipherText, int shiftKey) {
        cipherText = cipherText.toLowerCase();
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++) {
            int charPosition = ALPHABET.indexOf(cipherText.charAt(i));
            int keyValue = (charPosition - shiftKey) % 26;
            if (keyValue < 0) {
                keyValue = ALPHABET.length() + keyValue;
            }
            char replaceKeyVal = ALPHABET.charAt(keyValue);
            plainText += replaceKeyVal;
        }
        return plainText;
    }
}