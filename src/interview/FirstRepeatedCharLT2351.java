package interview;
// First Letter to Appear Twice - Lt-2351
public class FirstRepeatedCharLT2351 {
    static void main() {
        String s = "babccdd";
        char ch = firstRepeatedChar(s);

        IO.println("First5 Repeated char : "+ch);
        /*
        // to understand concept
        String s = "abca";
    int[] count = new int[26];

    for (char ch : s.toCharArray()) {
        IO.println(" : "+count[ch - 'a']++);

    }

// Print frequencies
    for (int i = 0; i < 26; i++) {
        if (count[i] > 0) {
            System.out.println((char)(i + 'a') + " : " + count[i]);
        }
    }
         */

    }
    static char firstRepeatedChar(String s) {
        int[] count = new int[26];

        for (char ch : s.toCharArray()) {
            if(count[ch - 'a'] > 0)
                return ch;
            else
                count[ch - 'a']++;
        }
        return '\0';
    }
}
