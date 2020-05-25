public class Main {
    public static String[] validAccount = {"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static String[] invalidAccount = {".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        for (String account : validAccount) {
            System.out.println("Account is " + account + " is valid: " + accountExample.validate(account));
        }

        for (String account : invalidAccount) {
            System.out.println("Account is " + account + " is valid: " + accountExample.validate(account));
        }
    }
}
