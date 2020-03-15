package Sesson3;

public class Snippet17 {
    public static void main(String[] args) {
        int i = 5;
        int j = i++;  // i=6, j=5
        int k = ++i;  //i=6,k=6
        i  = - i ; //now i is -6
        boolean result = false; //result is false
        result = !result;      //now result is true
    }
}
