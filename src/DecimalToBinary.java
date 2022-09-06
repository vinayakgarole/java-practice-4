import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary Number: ");
        int num=sc.nextInt();
        String b = " ";
        int t=num;
        while(t>0) {
            int r=t%2;
            t=t/2;
            b=r+b;
        }
        System.out.println("Binary equivalent of " +num+ " is " +b);
    }
}
