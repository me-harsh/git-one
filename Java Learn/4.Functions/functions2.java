public class functions2 {
    public static int prod(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String args[]){
        int a=3;
        int b=5;
        int product=prod(a,b);
        System.out.println("product is:"+product);
        //we can also use it for direct numbers as
        product=prod(83,72);
        System.out.println("product is:"+product);
    }
    
}
