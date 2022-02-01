package DSA.Patterns;
/*
    
    *********
     *******
      *****
       ***
        *

*/


public class Pattern9 {

    public static void main(String[] args){
        pattern9(10);
    }
    static void pattern9(int n){

        for(int i=1;i<=(2*n)-1;i++){

            int col=(2*n)-i;
            for(int j=1;j<=col;j++){
                if(j<=i-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    
    }
    
    
}
