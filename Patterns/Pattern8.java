package Patterns;
/*

        *
       ***
      *****
     *******
    *********

*/
public class Pattern8 {
    public static void main(String[] args){
        pattern8(5);
    }
    static void pattern8(int n){
    
        for(int i=0;i<n;i++){
            int col = n+i;
                for(int j=0;j<=col;j++){
                    if(j<n-i){
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
