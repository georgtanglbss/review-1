class pythag{
    public static void main (String[] args) {
        for(int a = 0;a < 500;a++){
            for(int b = 0;b < 500;b++){
                int c = 1000 - a - b;
                if(c*c == a*a + b*b){
                    System.out.println(a*b*c);
                    return;
                }
            }
        }
    }
}