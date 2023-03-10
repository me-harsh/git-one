public class functions6 {
    public static void bintodec(int binNum){
        int bn=binNum;
        int decNum=0;
        int pow=0;
        while(binNum>0){
            int ld =binNum%10;
            decNum+=(ld*(int)Math.pow(2,pow));
            binNum/=10;
            pow++;
        }
        System.out.println("decimal of "+bn+" is "+decNum);
    }
    public static void main(String args[]){
        bintodec(1100);
    }
    
}
