public class RemoveDuplicates {
    public static void remDup( String str, int index, StringBuilder newString, boolean map[]) {
        if ( index == str.length()) {
            System.out.println(newString);
            return;
        }

        // if the character value is in the map array
        char CurrentChar = str.charAt(index);
        if (map[ CurrentChar - 'a'] == true) {
            remDup(str, index+1, newString, map);
        }else{
            map[CurrentChar - 'a'] = true;
            // newString.append(CurrentChar);
            // remDup(str, index+1, newString, map);
            // * we can do these two statements at once
            remDup(str, index+1, newString.append(CurrentChar), map);
        }
        
        return ;
    }

    // 2nd method
    static boolean arr[] = new boolean[26];
    static StringBuilder sb = new StringBuilder("");
    static void removeDuplicates(String str, int idx){
        // first doing iteratively
        if(idx == str.length()){

            System.out.println(sb);
            return;
        }
        if(arr[str.charAt(idx)-'a']==false){
            arr[str.charAt(idx)-'a'] = true;
            sb.append(str.charAt(idx));
        }
        // idx++;
        removeDuplicates(str,idx+1);
        

        // doing it recusively

    }
    public static void main(String[] args) {
        String str = "appnacollege";
        remDup(str, 0, new StringBuilder(""), new boolean[26]);

    }
}