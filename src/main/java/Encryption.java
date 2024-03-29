public class Encryption {
    public static final String encrAlphabets = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String plainText, int shiftKey)
    {
        plainText = plainText.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++)
        {
            int charPosition = encrAlphabets.indexOf(plainText.charAt(i));
            int keyValue = (shiftKey + charPosition) % 26;
            char replaceKeyVal = encrAlphabets.charAt(keyValue);
            cipherText += replaceKeyVal;
        }
        return cipherText;
    }

}
