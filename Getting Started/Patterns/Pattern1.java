package Patterns;

//EXPECTED OUTPUT:
/*
    *****
    *****
    *****
    *****
    *****
*/


public class Pattern1 {

    public static void main(String[] args){
        pattern1(5);
    }
    static void pattern1(int n){
        //loop for number of rows
        for(int i=1;i<=n;i++){
            //2nd loop for number of columns
                for(int j=1;j<=5;j++){
                    System.out.print("*");
                }
                //for next line
                System.out.println();
        }
    }
}

