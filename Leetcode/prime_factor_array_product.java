import java.util.*;

public class prime_factor_array_product {
    public static HashSet primeFactor(int n){
        HashSet<Integer> factors = new HashSet<>();
        while(n%2==0){
            factors.add(2);
            n/=2;
        }
        for(int i=3;i*i<=n;i+=2){
            while(n%i==0){
                factors.add(i);
                n/=i;
            }
        }
        if(n>2){
            factors.add(n);
        }
        return factors;
    }

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(2,4,3,7,10,6));
        HashSet<Integer> prime_factor = new HashSet<Integer>();
        for(int i = 0; i < num.size(); i++){
            prime_factor.addAll(primeFactor(num.get(i)));
        }
        System.out.println(prime_factor);
        System.out.println(prime_factor.size());
    }
}
