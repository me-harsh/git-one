public class compare {
    public static void main(String[] args) {
        String fruits []= {"mango", "apple","guava"};
        String largest = "mango";
        for (int i = 1; i < fruits.length; i++) {
            if(largest.compareToIgnoreCase(fruits[i])<0) largest = fruits[i];
        }
        System.out.println("the largest string is :"+largest);
        
    }
}
