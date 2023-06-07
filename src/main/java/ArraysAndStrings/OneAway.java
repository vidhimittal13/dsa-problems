package ArraysAndStrings;

/**
 * There are three types of edits that can be performed on strings:
 * insert a character, remove a character, or replace a character.
 * Given two strings, write a function to check if they are one edit (or zero edits) away.
 * EXAMPLE
 * pale, ple -> true pales, pale -> true pale, bale -> true pale, bake -> false
 *
 */
public class OneAway {
    public static boolean isOneAway(String a, String b)
    {
        if(a.length()!=b.length() && Math.abs(a.length()-b.length())!=1) return false;
        String s1 = a.length()>=b.length()?a:b;
        String s2 = a.length()>=b.length()?b:a;
        int p1 = 0, p2 = 0;
        int flag = 0;

        if(s1.length()!=s2.length()) {
            while (p1 < s1.length() && p2 < s2.length()) {
                if (s1.charAt(p1) == s2.charAt(p2)) {
                    p1++;
                    p2++;
                } else {
                    flag++;
                    p1++;
                }
            }
        }
        else {
            while(p1<s1.length())
            {
                if(s1.charAt(p1)!=s2.charAt(p1)) flag++;
                p1++;
            }
        }
        return flag <= 1;

    }

    public static void main(String[] args) {
        String[][] tests = {{"a", "b"}, //true
                {"", "d"}, //true
                {"d", "de"}, //true
                {"pale", "pse"}, //false
                {"acdsfdsfadsf", "acdsgdsfadsf"}, //true
                {"acdsfdsfadsf", "acdsfdfadsf"}, //true
                {"acdsfdsfadsf", "acdsfdsfads"}, //true
                {"acdsfdsfadsf", "cdsfdsfadsf"}, //true
                {"adfdsfadsf", "acdfdsfdsf"}, //false
                {"adfdsfadsf", "bdfdsfadsg"}, //false
                {"adfdsfadsf", "affdsfads"}, //false
                {"pale", "pkle"}, //true
                {"pkle", "pable"}}; //false
        for (String[] test : tests) {
            System.out.println(isOneAway(test[0], test[1]));
        }

    }
}
