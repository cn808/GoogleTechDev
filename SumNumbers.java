package GoogleTechDev;

public class SumNumbers {
    /*
        https://codingbat.com/prob/p121193

        Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. 
        A number is a series of 1 or more digit chars in a row. 
        (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

        sumNumbers("abc123xyz") → 123
        sumNumbers("aa11b33") → 44
        sumNumbers("7 11") → 18
    */

    public static int sumNumbers(String str) {
        if(str == null || str.length() == 0) return 0;
        char[] input = str.toCharArray();
        int res = 0;
        int index = 0;

        while(index < str.length()) {
            int endIndex = index;
            while(endIndex < str.length() &&
                  input[endIndex] - '0' >= 0 &&
                  input[endIndex] - '0' <= 9) 
            {
                endIndex++;
            }

            if(endIndex > index) {
                res += Integer.parseInt(str.substring(index, endIndex));
                index = endIndex;
            } else {
                index++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers("abc123xyz"));
        System.out.println(sumNumbers("aa11b33"));
        System.out.println(sumNumbers("7 11"));
    }
}
