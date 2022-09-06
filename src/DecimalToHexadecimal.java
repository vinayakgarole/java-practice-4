import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal Number: ");
        int num = sc.nextInt();
        String b = "";
        int temp = num;
        while (temp > 0) {
            int r = temp % 16;
            temp = temp / 16;
            b = r + b;
        }
        System.out.println("Hexadecimal equivalent of " + num + " is " + b);
    }
}
