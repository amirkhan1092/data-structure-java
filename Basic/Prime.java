import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int num, count=0;
        Scanner sc = new Scanner(System.in);
        try {
            num = sc.nextInt();
            for(int i=2; i<=num; i++)
                if(num % i == 0)
                    count++;
            if(count == 2)
                System.out.println("Given Number is Prime Number ");    
            else
                System.out.println("Number is not Prime Number ");
        
        } catch (Exception e) {
            System.out.println("Problem with IO System ");
        }
        sc.close();
    }
}