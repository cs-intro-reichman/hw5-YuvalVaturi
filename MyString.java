/**
 * A library of string functions.
 */
public class MyString {
    public static void main(String args[]) {
        String hello = "hello";
        // System.out.println(countChar(hello, 'h'));
        // System.out.println(countChar(hello, 'l'));
        // System.out.println(countChar(hello, 'z'));
        // System.out.println(subsetOf("c", "space")); // returns true

        System.out.println(spacedString(hello));
        //// Put your other tests here.
        /// java MyString.java
        // System.out.println(countChar(hello, 'L'));
        // System.out.println(subsetOf("sap", "space"));// returns true
        // System.out.println(subsetOf("spa", "space")); // returns true
        // System.out.println(subsetOf("pass", "space")); // returns false
        System.out.println(subsetOf("quiz", "runi")); // returns true

        // System.out.println(spacedString("Spaced")); // S p a c e d
        // System.out.println(spacedString("hello")); // h e l l o
        // System.out.println(randomStringOfLetters(3)); // rand
        // System.out.println(randomStringOfLetters(7)); // rand
        // System.out.println(remove("committee", "meet")); // comit

    }

    /**
     * Returns the number of times the given character appears in the given string.
     * Example: countChar("Center",'e') returns 2 and countChar("Center",'c')
     * returns 0.
     * 
     * @param str - a string
     * @param c   - a character
     * @return the number of times c appears in str
     */
    public static int countChar(String str, char ch) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                counter++;
            }
        }

        return counter;
    }

    /**
     * Returns true if str1 is a subset string str2, false otherwise
     * Examples:
     * subsetOf("sap","space") returns true
     * subsetOf("spa","space") returns true
     * subsetOf("pass","space") returns false
     * subsetOf("c","space") returns true
     *
     * @param str1 - a string
     * @param str2 - a string
     * @return true is str1 is a subset of str2, false otherwise
     */
    public static boolean subsetOf(String str1, String str2) {
        int charAtIndex = 0;
        for (int i = 0; i < str1.length(); i++) {
            charAtIndex = str2.indexOf(str1.charAt(i));
            if (charAtIndex == -1) {
                return false;
            }

            str2 = str2.substring(0, charAtIndex) + str2.substring(charAtIndex + 1);
        }
        

        return true;
    }

    /**
     * Returns a string which is the same as the given string, with a space
     * character inserted after each character in the given string, except
     * for the last character.
     * Example: spacedString("silent") returns "s i l e n t"
     * 
     * @param str - a string
     * @return a string consisting of the characters of str, separated by spaces.
     */
    public static String spacedString(String str) {
        StringBuilder spaced = new StringBuilder();
        if (str.isEmpty()) {
            return ""; // Return an empty string for empty input
        }
        int i = 0;
        for (; i < str.length() - 1; i++) {
            spaced.append(str.charAt(i));
            spaced.append(" ");
        }
        spaced.append(str.charAt(i));

        return spaced.toString();
    }

    /**
     * Returns a string of n lowercase letters, selected randomly from
     * the English alphabet 'a', 'b', 'c', ..., 'z'. Note that the same
     * letter can be selected more than once.
     * 
     * Example: randomStringOfLetters(3) can return "zoo"
     * 
     * @param n - the number of letter to select
     * @return a randomly generated string, consisting of 'n' lowercase letters
     */
    public static String randomStringOfLetters(int n) {
        StringBuilder randStr = new StringBuilder();
        for (int i = 0; i < n; i++) {
            randStr.append((char) ((Math.random() * 26) + 'a'));
        }
        return randStr.toString();
    }

    /**
     * Returns a string consisting of the string str1, minus all the characters in
     * the
     * string str2. Assumes (without checking) that str2 is a subset of str1.
     * Example: remove("meet","committee") returns "comit"
     * 
     * @param str1 - a string
     * @param str2 - a string
     * @return a string consisting of str1 minus all the characters of str2
     * Example: remove("meet","committee") returns "comit"
     */
    public static String remove(String str1, String str2) {
        
            int index = 0;
    
            for (int i = 0; i < str2.length(); i++) {
                index = str1.indexOf(str2.charAt(i));
    
                if(index >= 0) {
                    str1 = str1.substring(0, index) + str1.substring(index + 1);
                }
                
            }
    
            return str1;
        }
  

    /**
     * Returns a string consisting of the given string, with the given
     * character inserted randomly somewhere in the string.
     * For example, insertRandomly("s","cat") can return "scat", or "csat", or
     * "cast", or "cats".
     * 
     * @param ch  - a character
     * @param str - a string
     * @return a string consisting of str with ch inserted somewhere
     */
    public static String insertRandomly(char ch, String str) {
        // Generate a random index between 0 and str.length()
        int randomIndex = (int) (Math.random() * (str.length() + 1));
        // Insert the character at the random index
        String result = str.substring(0, randomIndex) + ch + str.substring(randomIndex);
        return result;
    } // ''
}
