import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringTest {

    @Test
    public void longestSubstring() {
        String s1 = "abcabcbb";
        String s2 = "qwerfcxzxcvdsasdf";
        String s3 = "dfghyhnfgh";
        String s4 = "poiuytrewqpoiu";

        assertEquals(3, LongestSubstring.longestSubstring(s1));
        assertEquals(8, LongestSubstring.longestSubstring(s2));
        assertEquals(5, LongestSubstring.longestSubstring(s3));
        assertEquals(10, LongestSubstring.longestSubstring(s4));



    }
}