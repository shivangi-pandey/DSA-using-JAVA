package DSA.Patterns;

/*EXPECTED OUTPUT

    1
    12
    123
    1234
    12345
*/


public class Pattern4 {
    public static void main(String[] args){
        pattern4(5);
    }
    static void pattern4(int n){
        //loop for number of rows
        for(int i=1;i<=n;i++){
            //2nd loop for number of columns
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                //for next line
                System.out.println();
        }
    }
    
}
