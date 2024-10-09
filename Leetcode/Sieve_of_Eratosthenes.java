import java.util.*;

public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = new int[num+1];
        for(int i = 0; i <= num; i++) {
            arr[i] = 1;
        }
        for(int i = 2; i <= num/2; i++) {
            if(arr[i] == 1){
                for(int j = 2*i; j <= num; j = i+j){
                    arr[j] = 0;
                }
            }
        }
        for(int i = 2; i < num; i++) {
            if(arr[i] == 1){
                list.add(i);
            }
        }
        System.out.println(list);
    }
    
}