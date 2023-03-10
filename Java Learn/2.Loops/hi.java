import java.util.*;
public class hi {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("give ur no:");
            int a = sc.nextInt();
            if(a%10==0){
                continue;
            }
            else System.out.println(a);

        }while(true);
    }/*this code doesn't stop it will keep
    asking u for no.s*/
    //ultimately u will have to close the below terminal
    
}
