// 4.Take 2 numbers as inputs and find their HCF and LCM.
import java.util.*;
public class HcfNLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First No. :");
        int a = sc.nextInt();
        System.out.print("Enter the Second No. :");
        int b = sc.nextInt();
        HcfLcm(a,b);
        sc.close();
    }
    public static void HcfLcm(int a,int b){
      int H = (a<b)?a:b;
      int Hcf = 0;
      for(int i=H ; i >= 1 ;i--){
        if(H%i == 0 && b%i == 0){
            Hcf = i;
        }
      }
      int Lcm = a*b/Hcf;
      System.out.println("HCF is = "+Hcf);
      System.out.println("LCM is = "+Lcm);
    }
}
