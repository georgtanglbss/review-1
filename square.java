class square{
    public static void main (String[] args) {
        int a = 0;
        int b = 0;
        for(int i = 0;i <= 100;i++){
            a += i*i;
            b += i;
        }
        System.out.println(b*b - a);
    }
}