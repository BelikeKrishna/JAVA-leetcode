public class PalindromeTest {
    public static void main(String[] args) {
        SolutionPalindrome sol = new SolutionPalindrome();

        int num1 = 121;
        int num2 = -121;
        int num3 = 123;

        System.out.println(num1 + " is palindrome? " + sol.isPalindrome(num1)); // true
        System.out.println(num2 + " is palindrome? " + sol.isPalindrome(num2)); // false
        System.out.println(num3 + " is palindrome? " + sol.isPalindrome(num3)); // false
    }
}

class SolutionPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int i = 0;
        int temp = x;

        while (x > 0) {
            i = i * 10 + x % 10;
            x = x / 10;
        }

        return temp == i;
    }
}
