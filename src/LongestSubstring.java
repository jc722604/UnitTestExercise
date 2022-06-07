import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "qwerfcxzxcvdsasdf";
        String s3 = "dfghyhnfgh";
        String s4 = "poiuytrewqpoiu";
        System.out.println("s1: " + longestSubstring(s1));
        System.out.println("s2: " + longestSubstring(s2));
        System.out.println("s3: " + longestSubstring(s3));
        System.out.println("s4: " + longestSubstring(s4));
    }
    public static int longestSubstring(String s) {
        Set<Character> occ = new HashSet<>();
        int n = s.length();
        int rk = -1;
        int ans = 0;

        for(int i = 0; i < n; i++) {
            if(i != 0) {
                // left p move one block right, remove one char i
                occ.remove(s.charAt(i - 1));
            }

            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                //keep moving right p
                occ.add(s.charAt(rk + 1));
                rk++;
            }
            //The i to rk characters are the longest substring without repeating characters
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }
}
