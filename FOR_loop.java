import java.util.Scanner;
public class FOR_loop {
    public static void main(String_intro[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Limit : ");
        int n = sc.nextInt();
        System.out.println("The first " + n + " Whole Numbers are : ");
        for(int i = 0 ; i<n ; i++)
        {
            System.out.println(i);
        }
     }
}
