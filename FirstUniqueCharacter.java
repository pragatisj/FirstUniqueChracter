
    public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        int[] charCount = new int[26]; // Assuming lowercase English alphabet
        
        // Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount[c - 'a']++;
        }
        
        // Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCount[c - 'a'] == 1) {
                return i;
            }
        }
        
        return -1; // No non-repeating character found
    }
    
    public static void main(String[] args) {
        FirstUniqueCharacter finder = new FirstUniqueCharacter();
        
        String s1 = "leetcode";
        int result1 = finder.firstUniqChar(s1);
        System.out.println("Output 1: " + result1);
        
        String s2 = "loveleetcode";
        int result2 = finder.firstUniqChar(s2);
        System.out.println("Output 2: " + result2);
        
        String s3 = "aabb";
        int result3 = finder.firstUniqChar(s3);
        System.out.println("Output 3: " + result3);
    }
}

    

