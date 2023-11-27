// 15.Find Ncr & Npr

import java.util.Scanner;
public class question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r : ");
        int r = sc.nextInt();

        System.out.print("Write nCr to claculate Combination or nPr for Permutation : ");
        String str  = sc.next();
        
        if(str.equals("nCr")){
           int Combination =  calculateCombination(n , r);
           System.out.println("Total NO. of Combinations are : "+Combination);
        }else{
            int Permutation = calculatePermutation(n , r);
            System.out.println("Total No. of Permutations are : "+Permutation);
        }
        sc.close();
    }

    public static int calculateCombination(int n , int r){
       int nFactorial = calculateFactorial(n);
       int rFactorial = calculateFactorial(r);
       int nMrFactorial = calculateFactorial(n-r);
       int Combination = nFactorial/(rFactorial*(nMrFactorial));
       return Combination;
    }
    public static int calculatePermutation(int n , int r){
       int nFactorial = calculateFactorial(n);
       int nMrFactorial = calculateFactorial(n-r);
       int Permutation = nFactorial/(nMrFactorial);
       return Permutation ;
    }

    public static int calculateFactorial(int n){
      int ans = 1;
      for(int i=n;i>1;i--){
        ans *= i;
      }
      return ans ;
    }
}
