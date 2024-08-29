import java.util.*;

public class countSetBit {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int count = 0;
        while(num != 0){
            num = num & (num - 1);
            count++;
        }
        System.out.println(count);
    }
}
