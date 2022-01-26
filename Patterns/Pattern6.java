package Patterns;

/* 

         *
        **
       ***
      ****
     *****


*/

public class Pattern6 {

    public static void main(String[] args){
        pattern6(5);
    }
    static void pattern6(int n){

        for(int i=1;i<=n;i++){

            for(int j=0;j<n;j++){
                if(j<n-i){              //condition for printing spaces
                System.out.print(" ");
                }
                else{                   //for printing stars
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
}
