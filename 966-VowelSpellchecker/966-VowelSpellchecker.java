// Last updated: 9/14/2025, 11:52:13 PM
class Solution {
    private Set<String> exactSet;
    private Map<String, String> caseMap;
    private Map<String, String> vowelMap;

    public Solution() {
        exactSet = new HashSet<>();
        caseMap = new HashMap<>();
        vowelMap = new HashMap<>();
    }

    private String toLower(String s) {
        return s.toLowerCase();
    }

    private String replaceVowel(String s) {
        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                result.append('_');
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public String[] spellchecker(String[] wordlist, String[] queries) {
        // Prepare data structures for quick lookup
        exactSet.clear();
        caseMap.clear();
        vowelMap.clear();

        for (String word : wordlist) {
            exactSet.add(word);

            String lowerCase = toLower(word);
            caseMap.putIfAbsent(lowerCase, word);

            String vowelCase = replaceVowel(lowerCase);
            vowelMap.putIfAbsent(vowelCase, word);
        }

        // Process queries and find the best match
        String[] results = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];

            // 1. Exact Match
            if (exactSet.contains(query)) {
                results[i] = query;
                continue;
            }

            String lowerCaseQuery = toLower(query);
            // 2. Case-Insensitive Match
            if (caseMap.containsKey(lowerCaseQuery)) {
                results[i] = caseMap.get(lowerCaseQuery);
                continue;
            }

            String vowelCaseQuery = replaceVowel(lowerCaseQuery);
            // 3. Vowel-Insensitive Match
            if (vowelMap.containsKey(vowelCaseQuery)) {
                results[i] = vowelMap.get(vowelCaseQuery);
                continue;
            }
            
            // No match found
            results[i] = "";
        }

        return results;
    }
}