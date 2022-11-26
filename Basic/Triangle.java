import java.util.Scanner;

public class Triangle {
    public static void main(String [] argv)
    {  
        try (Scanner sc = new Scanner(System.in)) {
            // int rows;
            int rows = sc.nextInt();
            for(int i=1; i<=rows; i++)
            {
                for(int j=0; j<i; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            System.out.println("Problem with Input and Output");
        }


    }
}
