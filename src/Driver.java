public class Driver {
    public static void main(String[] args) {
        String testEncrypt = Crypto.encrypt("this is a secret message", 6);
        System.out.println(testEncrypt);
        String testDecrypt = Crypto.decrypt(testEncrypt, 6);
        System.out.println(testDecrypt);
    }
}
