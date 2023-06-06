package ArraysAndStrings;

import java.util.Arrays;

public class isPermutation {
    //Given two strings, write a method to decide if one is a permutation of the
    //other.
    public static boolean permutation(String a, String b)
    {
        if(a.length()!=b.length()) return false; //If they're not the same length, one cannot be a permutation of the other
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        return Arrays.equals(a1, b1);
    }
    public static void main(String[] args)
    {
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean anagram = permutation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + anagram);
        }
    }
}
