package ArraysAndStrings;
public class URLify {
    public static void makeURL(char[] str, int trueLength)
    {
        //Write a method to replace all spaces in a string with '%20'. You may assume that the string
        //has sufficient space at the end to hold the additional characters, and that you are given the "true"
        //length of the string. (Note: If implementing in Java, please use a character array so that you can
        //perform this operation in place.)


        //I'm assuming here that the size of the array is the exact size of the string after making the changes
        //In case that assumption cannot be made, we would calculate the number of spaces up until the true length
        //and then calculate index as (trueLength + numberOfSpaces*2) and use that value
        int index = str.length;
        for (int i = trueLength-1; i >=0 ; i--) {
            if(str[i]==' ')
            {
                str[index-1] = '0';
                str[index-2] = '2';
                str[index-3] = '%';
                index = index-3;
            }
            else {
                str[index-1] = str[i];
                index = index-1;
            }
        }
    }
    public static int findLastCharacter(char[] str) {
        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i] != ' ') {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "Mr John Smith    ";
        char[] arr = str.toCharArray();
        int trueLength = findLastCharacter(arr) + 1;
        makeURL(arr, trueLength);
        for (char c : arr) {
            System.out.print(c);
        }
    }
}
