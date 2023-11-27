// 19.HCF and LCM Of Two Numbers Program

import java.util.*;
public class HCFandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First No. : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second No. : ");
        int b = sc.nextInt();

        int h = a < b ? a : b;

        int i=h;
        int HCF = 0;
        while (i>=1) {
            if(a%h==0 && b%h==0){
                HCF = i;
                System.out.println("HCF of given two No. : "+HCF);
                break;
            }else{
                i--;
            }
        }
            int LCM = (a*b)/HCF;
            System.out.println("LCM of given two No. : "+LCM);

        sc.close();
    }
}
