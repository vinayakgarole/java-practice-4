import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a octal Number: ");
        int num=sc.nextInt();
        int d=0;
        int temp=num;
        int i=0;
        String b = " ";
        while(temp>0) {
            int r=temp%10;
            temp=temp/10;
            d=d+r* (int) Math.pow(8, i++);
        }
        while(d>0) {
            int r=d%2;
            d=d/2;
            b=r+b;
        }
        System.out.println("Binary of " +num+ " is " + b);
    }
}
