// 21.Java Program Vowel Or Consonant

import java.util.Scanner;
public class question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Letter to check wheather it is a Vowel or Consonent : ");
        char letter = sc.next().charAt(0);
        
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            System.out.println("The given Letter is a Vowel...");
        }else{
            System.out.println("The given Letter is  a Consonent...");
        }

        sc.close();
    }
}
