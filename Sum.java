class Sum{

    public static void main (String[] args) {
        int i = 0;
        for(int j = 0;j < 1000;j++){
            if(j % 3 == 0 || j % 5 == 0){
                i += j;
            }
        }
        System.out.println(i);
    }
}
        