public class Decryption {
    public static final String alphabets = "abcdefghijklmnopqrstuvwxyz";

    public static String decrypt(String cipherText, int shiftKey) {
        cipherText = cipherText.toLowerCase();
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++) {
            int charPosition = alphabets.indexOf(cipherText.charAt(i));
            int keyValue = (charPosition - shiftKey) % 26;
            if (keyValue < 0) {
                keyValue = alphabets.length() + keyValue;
            }
            char replaceKeyVal = alphabets.charAt(keyValue);
            plainText += replaceKeyVal;
        }
        return plainText;
    }
}