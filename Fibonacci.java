class Fibonacci{
    public static void main (String[] args) {
        int a = 1;
        int b = 2;
        int sum = 2;
        for(int i = 0;i<4000000;){
            if(i % 2 ==0){
                sum += i;
            }
            i = a + b;
            a = b;
            b = i;    
        }
        System.out.println(sum);
    }
}
    
    
    
    