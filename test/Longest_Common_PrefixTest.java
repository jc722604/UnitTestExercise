import org.junit.Test;

import static org.junit.Assert.*;

public class Longest_Common_PrefixTest {

    @Test
    public void longestCommonPrefix() {
        String[] str = {"flower", "flo", "flee"};
        String[] str1 = {"fwer", "fsslo", "aflasdee"};
        String[] str2 = {"lower", "longest", "lasvagas", "louis"};
        String[] str3 = {"game", "gainer", "given"};
        assertEquals("fl", Longest_Common_Prefix.longestCommonPrefix(str));
        assertEquals("", Longest_Common_Prefix.longestCommonPrefix(str1));
        assertEquals("l", Longest_Common_Prefix.longestCommonPrefix(str2));
        assertEquals("g", Longest_Common_Prefix.longestCommonPrefix(str3));
    }
}