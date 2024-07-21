import java.util.Arrays;
public class hw2 {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";

        // converting strings to lowercase so our extra work is reduced
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length()==str2.length()) {
            
            // concerting string to char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            //sort the char array

            Array.sort(str1charArray);
            Array.sort(str2charArray);

            //  if the sorted arrays are same then the strings are anagram

            boolean result = Arrays.equals(str1charArray , str2charArray);

            if (result) {
                System.out.println(str1 + "and " + str2 + "are anagrams of each other.");
            }
            else System.out.println(str1 + "and " + str2 + "are anagrams of each other.");
        }
        else {
            // when the lengths are not equal
            System.out.println(str1 + "and " + str2 + "are anagrams of each other.");
        }

    }
    
}
