package leetcode;

public class StringInputOutput
{
        public static String rearrange(String str) {
            StringBuilder letters = new StringBuilder();
            StringBuilder digits = new StringBuilder();

            // Separate letters and digits
            for (char ch : str.toCharArray()) {
                if (Character.isDigit(ch)) {
                    digits.append(ch);
                } else {
                    letters.append(ch);
                }
            }

            // Merge letters and digits alternately
            StringBuilder result = new StringBuilder();
            int i = 0, j = 0;
            while (i < digits.length() && j < letters.length()) {
                result.append(digits.charAt(i++));
                result.append(letters.charAt(j++));
            }

            return result.toString();
        }

        public static void main(String[] args) {
            String str = "a1b2c3d4";
            System.out.println(rearrange(str)); // Output: 1a2b3c4d
        }

}
