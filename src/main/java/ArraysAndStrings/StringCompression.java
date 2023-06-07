package ArraysAndStrings;

public class StringCompression {
    /**
     * Implement a method to perform basic string compression using the counts of repeated characters.
     * For example, the string aabcccccaaa would become a2b1c5a3.
     * If the "compressed" string would not become smaller than the original string, your method should return
     * the original string. You can assume the string has only uppercase and lowercase letters (a - z).*
     * Points I would clarify:
     * 1. What is meant by "smaller than original string"? Are we simply talking about the length?
     * 2. Are uppercase and lowercase characters treated differently?
     */
    public static String compress(String s)
    {
        if(s.equals("")) return "";
        StringBuilder ans = new StringBuilder();
        int p1 = 0, p2 = 1;
        int count = 1;
        while(p1 < s.length() && p2 <s.length())
        {
            if(s.charAt(p1)==s.charAt(p2))
            {
                count++;
                p2++;
            }
            else{
                ans.append(s.charAt(p1)).append(count);
                p1 = p2;
                p2++;
                count = 1;
            }
        }
        ans.append(s.charAt(p1)).append(count); //for the last character
        return (ans.length() < s.length()) ? ans.toString() : s;
    }

    public static void main(String[] args) {
        String str1 = "aaaaabbbbaaaabbddc";
        System.out.println(compress(str1));
        String str2 = "abcde";
        System.out.println(compress(str2));
    }

}
