package Patterns;

//EXPECTED OUTPUT
/*
    *****
    ****
    ***
    **
    *

*/


public class Pattern3 {
    public static void main(String[] args){
        pattern3(5);
    }
    static void pattern3(int n){
        //loop for number of rows
        for(int i=1;i<=n;i++){
            //2nd loop for number of columns
                for(int j=1;j<=n-i+1;j++){
                    System.out.print("*");
                }
                //for next line
                System.out.println();
        }
    }
}


