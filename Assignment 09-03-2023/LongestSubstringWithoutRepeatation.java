package string;

import java.util.*;

class LongestSubstringWithoutRepeatation {
  public static int longestSubstrDistinctChars(String s)
  {
    if (s.length() == 0) {
      return 0;
    }
    int n = s.length();
    HashSet<Character> st = new HashSet<Character>();
    int len = 1;
    st.add(s.charAt(0));
    int i = 1;
    int maxLen = 0;
    while (i < n) {
      if (s.charAt(i) != s.charAt(i - 1)
          && !st.contains(s.charAt(i))) {
        st.add(s.charAt(i));
        len++;
        i++;
        if (len > maxLen) {
          maxLen = len;
        }
      }
      else {
        if (len == 1) {
          i++;
        }
        else {
          st.clear();
          i = i - len + 1;
          len = 0;
        }
      }
    }
    return Math.max(maxLen, len);
  }
 
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
    String str = sc.nextLine();
    
    int len = longestSubstrDistinctChars(str);
    System.out.println(
      "The length of the longest non-repeating character substring "
      + len);
  }
}
