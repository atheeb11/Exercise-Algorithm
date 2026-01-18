public class PalindromeChecker {
    public static void main(String[] args) {
        String word = "Katak";
        String clean = word.toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();

        if (clean.equals(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}