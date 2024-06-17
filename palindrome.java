public class palindrome {
    static void palindrome(int num){ // Reverse and match original
        int rev = 0;
        int original = num;
        while(num != 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        if(original == rev){
           System.out.println("The number is a palindrome.");
        }
        else{
            System.out.println("The number is not a palindrome.");
        }
    }  
    
    static void opitmized(int num){ // num -> string -> char
        String strnum = Integer.toString(num) ; //num to string
        int start = 0;
        int end = strnum.length() - 1 ;
        while (start < end) {
            if(strnum.charAt(start) != strnum.charAt(end)){  //string to individual char
                System.out.println("The number is not a palindrome.");
                return;
            }
            start++;
            end--;
        }
        System.out.print("This is a palindrome");
    }

    public static void main(String[] args) {
        // palindrome(12321);

        opitmized(525);
    }
}
