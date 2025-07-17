public class RomanTOint{
    public static void main(String[] args) {
        SolutionRomanTOint sol = new SolutionRomanTOint();

        System.out.println(sol.romanToInt("III"));       // 3
        System.out.println(sol.romanToInt("MCMXCIV"));   // 1994
    }
}

class SolutionRomanTOint {
    public int romanToInt(String s) {
        int value = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int num = 0;
            char ch = s.charAt(i);
            switch (ch) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }

            if (prev <= num) {
                value += num;
            } else {
                value -= num;
            }
            prev = num;
        }
        return value;
    }
}
