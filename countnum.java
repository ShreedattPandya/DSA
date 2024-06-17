class countnum{
    public static void brute(int num){
        int count =0;
        while(num>0){
            int init = num % 10; 
            count++;
            num /= 10;
        }
        System.out.println(count);
    }

    public static int optimized(int num){
        int count = (int)(Math.log10(num)+1); // math.log point me slighlty less value dega agar number ke values thode chote hai, so add 1
        return count;
    }
    public static void main(String[] args) {
        
    // opitmized 
    int digits = optimized(12345);
    System.out.println(digits);

    //    brute(12345);
    }
}