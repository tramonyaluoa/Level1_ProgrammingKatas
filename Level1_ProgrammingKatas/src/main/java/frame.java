class  FrameSomeText {
    public static void frame(String[] check ){
        int longestStringLength = 0;
        for (int i=0; i < check.length; i++) {
            if (check[i].length() > longestStringLength){
                longestStringLength = check[i].length();
            }
        }
        for (int i= 0; i < longestStringLength+4;i++){
            System.out.print("*"); //top
        }
        System.out.println(" ");
        for (int i= 0; i < check.length;i++){ // middle
            System.out.print("* " + check[i]);
            int NoOfSpaces = longestStringLength - check[i].length()+1;
            for (int j =0; j <NoOfSpaces;j++ ){
                System.out.print(" " );
            }
            System.out.println("*");
        }
        for (int i= 0; i < longestStringLength+4;i++){
            System.out.print("*"); //bottom
        }
    }
    public static void main(String[] args) {
        String [] check = {"Write", "good", "code ", "every", "day","and","make","sure","it's","flexible"};
        frame(check);
    }
}