package DSA.Arrays;
import java.util.Scanner;
public class Buyandsellstock {
    

//public class BuyAndSellStock1 {
  
    public static void main(String args[]) {
        try(Scanner scn=new Scanner(System.in)){
        System.out.println("Enter no of elements of array : ");
        int n=scn.nextInt();

        int prices[]= new int[100];
        System.out.println("Enter  elements of array : ");
        for(int i=0;i<n;i++){
            prices[i]=scn.nextInt();
        }
        int output = maxprofit(prices);
        System.out.println("MAX PROFIT IS : "+ output);
    }
    }
    public static int maxprofit(int prices[]){
         int minprice = Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            else if(maxprofit<prices[i]-minprice){
                maxprofit=prices[i]-minprice;
                
            }
        }
        return maxprofit;
    }
}
    