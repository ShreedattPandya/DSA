// Solve if last 2 digits are zeros, reverse should not have it 
public class reverse {

    static void reverse(int num){
        while (num > 0) {
            int lastdig = num % 10;
            num /= 10;
            System.out.print(lastdig);
        }
    }

    static void optimal(int num){
        int rev = 0; 
        while(num > 0){
            int lastdig = num % 10;
            rev = (rev * 10) + lastdig; 
            num /= 10;
        }
    }
    public static void main(String[] args) {
        // reverse(12345);

        optimal(12345);
    }
    
}
