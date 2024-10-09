import java.util.*;

public class prime_palindrome {
    public static boolean isPrime(int num) {
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String val) {
        int i = 0;
        int j = val.length() - 1;
        while(i < j){
            if(val.charAt(i) != val.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        while(true){
            if(isPrime(num)){
                String val = String.valueOf(num);
                if(val.length() % 2 != 0){
                    if(isPalindrome(val)){
                        System.out.println(num);
                        break;
                    }   
                }
            }
            num++;
        }
    }
}
