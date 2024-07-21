public class functions7 {
    // public static int dectobin(int decNum){
    //     int bin=0;
    //     while(decNum!=0){
    //         bin=(bin*10)+(decNum%2);
    //         decNum/=2;
    //     }
    //     return bin;
    // }
    public static void dectobin(int decNum){
        int dn=decNum;
        int bin=0;
        while(decNum!=0){
            bin=(bin*10)+(decNum%2);
            decNum/=2;
        }
        System.out.println("binary of "+dn+" is "+bin);
    }
    public static void main(String args[]){
        dectobin(12);
    }
    
}
