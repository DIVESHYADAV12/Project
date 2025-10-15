import java.util.Scanner;
public class Taking_input {
    public static void main(String_intro[] args)
    {
        System.out.println("Taking Input from user");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.print("The Sum of these Numbers are : ");
        System.out.println(sum);

    }
}
