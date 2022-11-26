import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount;
        // int two_k=0, five_h=0, two_h=0, one_h=0;
        System.out.println("Enter the amount to be withdraw\n(Multiple of 100) ");
        amount = sc.nextInt() - 1;
        int two_k = amount / 2000;
        amount %= 2000;
        int five_h = amount / 500;
        amount %= 500;
        int two_h = amount / 200;
        amount %= 200;
        int one_h = amount / 100 + 1;

        System.out.println("Number of Two thausand notes "+two_k);
        System.out.println("Number of Five hundred Notes "+five_h);
        System.out.println("Number of Two Hundred Notes "+two_h);
        System.out.println("Number of One Hundred Notes "+one_h);

        
        sc.close();
    }
}
