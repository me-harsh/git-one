import java.util.Scanner;
public class hey {
    
    public static void main(String[] args) {
    
        GFG gf = new GFG();
        
    }
    
    
}
// Java Program to demonstrate Different
// Ways of Initializing a final Variable

// Main class 
class GFG {
  
    // a final variable
    // direct initialize
    final int THRESHOLD = 5;
    
    // a blank final variable
    final int CAPACITY;
    
    // another blank final variable
    final int  MINIMUM;
    
    // a final static variable PI
    // direct initialize
    static final double PI = 3.141592653589793;
    
    // a  blank final static  variable
    static final double EULERCONSTANT;
    
    // instance initializer block for 
    // initializing CAPACITY
    {
        CAPACITY = 25;
        System.out.println("non-static initializer block");
    }
    
    // static initializer block for 
    // initializing EULERCONSTANT
    static{
        EULERCONSTANT = 2.3;
        System.out.println("static block here");
    }
    
    // constructor for initializing MINIMUM
    // Note that if there are more than one
    // constructor, you must initialize MINIMUM
    // in them also
    public GFG() 
    {
        MINIMUM = -1;
    }
        
}


