package ArraysAndStrings;

public class StringRotation {
    /**
     * Assume you have a method isSubstring which checks if one word is a substring of another.
     * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to
     * isSubString (e.g., "waterbottle" is a rotation of" erbottlewat").
     */
    /**
     * LOGIC:
     *
     * Let s1 = "waterbottle"
     * Let x = "wat"
     * Let y = "erbottle"
     * Therefore, s1 = xy
     *
     * Therefore, s2 can be written as
     * s2 = yx = "erbottle" + "wat" = "erbottlewat"
     *
     * xyxy = "waterbottlewaterbottle"
     * yx HAS to be part of xyxy if s2 is a rotation of s1.
     */
    public static boolean stringRotation(String s1, String s2)
    {
        if(s1.length()!=s2.length()) return false;
        if(s1.length()==0) return false;
        String xyxy = s1+s1;
        return isSubstring(xyxy, s2);
    }

    /***
     * This method is provided according to the question
     * @param s1 the first sentence
     * @param s2 the second sentence
     * @return if the second sentence is a substring of the first sentence
     */
    public static boolean isSubstring(String s1, String s2)
    {
        /**
         * CODE
         */
        return true;
    }
}
