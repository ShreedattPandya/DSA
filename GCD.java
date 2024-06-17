public class GCD {
    static void GCD(int num1,int num2){
        int sqrt1 = (int)Math.sqrt(num1);
        int sqrt2 = (int)Math.sqrt(num2);
        
        //Factors of num1
        int[] arr1 = new int[num1]; //Store factors here
        for (int i = 1; i <= sqrt1; i++) {
            if(num1 % i == 0){
                System.out.print(i + " ");
            }
            
        }

        //Factors of num2
        int[] arr2 = new int[num2]; //Store factors here
        for (int i = 1; i <= sqrt2; i++) {
            if(num2 % i == 0){
                System.out.print(i + " ");
            }
            
        }        
        //Check from smaller value for largrest factor to match with another number 
        
    }
    public static void main(String[] args) {
        GCD(9,1);
    }
}
