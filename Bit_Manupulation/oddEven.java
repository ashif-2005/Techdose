public class oddEven {
    public static void main(String[] args) {
        //odd or even using bitwise operators
        int num = 10;
        if ((num & 1) == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}
