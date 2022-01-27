package DSA.Arrays;

import java.util.*;
public class DigitFrequency {
   

        public static void main(String[] args){
            try (Scanner scn = new Scanner(System.in)) {
                System.out.println("Enter num: ");
                   int num=scn.nextInt();
                   System.out.println("Enter Digit: ");
                   int digit=scn.nextInt();
                   int ans= countfreq(num,digit);
                   System.out.println("answer: "+ ans);
            }
        }
       public static int countfreq(int num,int digit){
           int ans=0; 
        while(num>0)
        {
            int temp =num%10;
            num=num/10;

            if(temp==digit){
                ans++;
            }
            
        }
        return ans;
        
    }
        }

