
public class setABit {
     public static void main(String[] args) {
        int num = 5;
        int i = 1;
        num = num | (1 << i);
        System.out.println(num); // Output: 7 (Binary: 101 | 100 = 111)
    }
}
