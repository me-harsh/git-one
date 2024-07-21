public class BinaryString {
    public static void priBinaryString(int n, int lastPlace, String str) {
        if(n==0){
            System.out.println(str);;
            return;
        }
        
        if(lastPlace==0){
            str+="0";
            priBinaryString(n-1, 0, str);
            str+="1";
            priBinaryString(n-1, 1, str);
        }else {
            str+="0";
            priBinaryString(n-1, 0, str);
        }
    // !here you have to remove the appended before the recurssion goes back a function
        return ;
    }
    // * 2nd way
    public static void BinString(int n, int lastPlace, String str) {
        // ?since appending 0 is same in both the case so we can reduce there
        if(n==0){
            System.out.println(str);
            return;
        }
        BinString(n-1, 0, str+"0");
        // * is function mei 
        if(lastPlace==0){
            BinString(n-1, 1, str+"1");
        } 
        //! done this way because it shouldn't remember the details like the string and the lastbit
        // ! when the branch got done and deleted.
    
        return ;
    }
    public static void main(String[] args) {
        priBinaryString(3, 0,"");
    }
}
