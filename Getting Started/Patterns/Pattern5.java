package Patterns;

/* EXPECTED OUTPUT

    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *

*/


public class Pattern5 {

    public static void main(String[] args){
        pattern5(5);
    }

    static void pattern5(int n){
        for(int row=0 ; row<2*n ; row++){       //loop will run till < 2*n that is number of rows 

            int col = row >n ? (2*n)-row : row; //if row number is greater than n than (2*n)-row stars will be printed else row stars will be printed;

            for(int j=0;j<col;j++){

                System.out.print("*");

            }
            System.out.println();
        }
    }
    
}
