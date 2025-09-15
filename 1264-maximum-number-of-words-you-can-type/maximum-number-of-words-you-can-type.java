class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        // lets use a set for O(1)

        // to count words
        int count = 0;

        boolean[] brokenword = new boolean[26]; // initially all false

        for (char ch : brokenLetters.toCharArray()) {
            brokenword[ch - 'a'] = true;    // store the indexes of broken words
        }

        String[] words = text.split(" "); // split the text into words (not "")

        for (String word : words) {
            // set cantype = true;
            boolean cantype = true;

            for (char ch : word.toCharArray()) {
                // check the letters
                if (brokenword[ch - 'a']) { // if broken char exists → true
                    cantype = false;
                    break;
                }
            }

            if (cantype) {
                count++;
            }
        }
        return count;
    }
}
