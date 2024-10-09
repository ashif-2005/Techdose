import java.util.*;
import java.lang.Math;

public class prime {

    public static boolean isPrime(int num){
        for(int i = 2; i < Math.sqrt(num)+1; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        boolean prime = isPrime(num);
        if (prime){
            System.out.println("The Given Number is Prime");
        }
        else{
            System.out.println("The Given Number is not Prime");
        }
    }
}
