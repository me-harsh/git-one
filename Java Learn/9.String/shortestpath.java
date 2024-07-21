
public class shortestpath {
    public static float displacement(String str) {
        int x=0, y=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='w' || str.charAt(i)=='W') y--;
            else if(str.charAt(i)=='e' || str.charAt(i)=='E') y++;
            else if(str.charAt(i)=='n' || str.charAt(i)=='N') x++;
            else if(str.charAt(i)=='s' || str.charAt(i)=='S') x--;
            else {
                System.out.println("bhai direction sahi dal");
                return -1;
            }
        }
        float dis=(float)Math.sqrt((x*x)+(y*y));
        return dis;
    }
    public static void main(String[] args) {
        String str = "wneenesenns";
        if (displacement(str)==-1) {
            System.out.println("not a valid direction char");
            
        } else {
            
            System.out.println("the shortest distance between the initial and the final point is :"+displacement(str));
        }
    }
}
