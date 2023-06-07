package ArraysAndStrings;

//    Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome.
//    A palindrome is a word or phrase that is the same forwards and backwards.
//    A permutation is a rearrangement of letters.
//    The palindrome does not need to be limited to just dictionary words.
//            EXAMPLE
//            Input: Tact Coa
//            Output: True (permutations: "taco cat", "atco eta", etc.)
public class PalindromePermutation {
    public static boolean isPermutation(String s)
    {
        s= s.toLowerCase().trim();
        System.out.println(s);
        if(s.equals("") || s.equals(" ")) return false;
        int[] chars = new int[26]; //The number of letters in the alphabet

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)<97 || s.charAt(i)>122) continue;
            int index = s.charAt(i)-'a';
            chars[index] = chars[index]+1;
        }
        int flagForOne=0;
        for (int i = 97; i<=122; i++)
        {   int value = chars[i-'a'];
            if(value>2)
            {   if(value%2==0) value = 2;
                else value = 1;
            }
            if(value==1) flagForOne++;
        }
        return flagForOne <= 1;
    }
    public static void main(String[] args) {
        String pali1 = "Rats live on no evil star";
        System.out.println(isPermutation(pali1));

        String pali2 = "Tact Coa";
        System.out.println(isPermutation(pali2));

        String pali3 = "Vidhi Mittal at Palantir";
        System.out.println(isPermutation(pali3));

        String pali4= "Tacataa";
        System.out.println(isPermutation(pali4));

        String pali5 = "abbba";
        System.out.println(isPermutation(pali5));

        String pali6 = "Taco   tac";
        System.out.println(isPermutation(pali6));
    }
}
