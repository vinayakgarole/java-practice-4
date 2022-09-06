import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n1, n2, i, gcd = 0;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        for (i=1; i<=n1 && i<=n2; i++) {
            if (n1%i==0 && n2%i==0) {
                gcd = i;
            }
        }
        System.out.println("Enter first Number : "+n1);
        System.out.println("Enter second Number ; "+n2);
        System.out.println("GCD : "+gcd);
    }
}