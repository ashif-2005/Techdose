import java.util.*;

public class prime_arrangement {
    public static boolean isPrime(int num){
        for(int i = 2; i < Math.sqrt(num)+1; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static int countPrime(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(isPrime(arr[i])){
                count++;
            }
        }
        return count;
    }

    public static int fact(int num){
        int fact = 1;
        for(int i = num; i > 0; i--){
            fact *= i;
        }
        System.out.println(num + " factorial is: " + fact);
        return fact;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int arr[] = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = i;
        }
        System.out.println("Number of prime :" + countPrime(arr));
        int num_of_prime = countPrime(arr);
        int num_of_non_prime = num - num_of_prime;
        int prime_fact = fact(num_of_prime);
        int non_prime_fact = fact(num_of_non_prime);        
        System.out.println(prime_fact*non_prime_fact); 
    }
}