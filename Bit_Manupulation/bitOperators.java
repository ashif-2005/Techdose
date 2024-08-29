import java.util.*;

/**
 * The number is power of two
 */
public class bitOperators {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = obj.nextInt();
        int var = number & (number - 1);
        if(var == 0){
            System.out.println("The given number is power of 2");
        }
        else{
            System.out.println("The given number is not power of 2");
        }
    }
}