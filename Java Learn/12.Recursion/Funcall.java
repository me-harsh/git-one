
public class Funcall {
    public static void priDec(int n) {
    
        if(n==1) {
            System.out.print(1 +" ");
            return;
        }
        System.out.print(n+" ");
        priDec(n-1);
        return ;
    }
    public static void main(String[] args) {
    
        priDec(10);
        return;
    }
}
