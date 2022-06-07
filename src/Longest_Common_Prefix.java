/**
 input :
        str = ["flower", "flow", "flight"]
 output:
        "fl"
 */

public class Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] str) {
        int row = str.length;
        int cols = str[0].length();

        for(int i =0; i < cols; i++) {
            char firstChar = str[0].charAt(i);
            for(int j =i; j < row; j++) {
                if(str[j].length() == i || str[j].charAt(i) != firstChar) {
                    return str[0].substring(0, i);
                }
            }
        }
        return str[0];
    }
}
