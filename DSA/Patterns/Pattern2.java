package DSA.Patterns;

//EXPECTED OUTPUT:
/*
    *
    **
    ***
    ****
    *****
*/

public class Pattern2 {

    public static void main(String[] args){
        pattern2(5);
    }
    static void pattern2(int n){
        //loop for number of rows
        for(int i=1;i<=n;i++){
            //2nd loop for number of columns
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                //for next line
                System.out.println();
        }
    }
}
