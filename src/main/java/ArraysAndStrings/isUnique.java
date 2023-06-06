package ArraysAndStrings;

public class isUnique {
    //Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
    public static boolean unique(String s)
    {
        //Cannot be unique if length exceeds 128
        if(s.length()>128)
            return false;

        boolean[] chars = new boolean[128]; //Each array space is for every possible character
        for (int i=0; i<s.length(); i++)
        {
            if(chars[s.charAt(i)]) return false;
            chars[s.charAt(i)] = true;
         }
        return true;
    }
    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            System.out.println(word + ": " + unique(word));
        }
    }
}
