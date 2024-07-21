import java.util.*;
public class strings {
    public static void main(String[] args) {
        // char a[] = {'a','b','c','d'};
        // String string = new String ("xyz");
        // String sr= "abcd";
        Scanner sc = new Scanner(System.in);

        String sr;
        System.out.println("enter the value of string sr");
        
        sr= sc.nextLine();
        System.out.println("enter the value of string ");
        
        String string= sc.nextLine();
        System.out.println(sr);
        System.out.println(string);
        
        String str = sr +" "+ string;
        System.out.println(str);
        // charAt() this function gives the character at that position in the string
        // example str.charAt(0) gives the the character at first index
        System.out.println(str.charAt(5));
    }
}
