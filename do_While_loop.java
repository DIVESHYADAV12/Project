
import java.util.Scanner;
public class do_While_loop {
    public static void main(String_intro[] args)
    {
       /*int i=1;
        do{
            System.out.println("Number from 1 to 10");
            System.out.println(i);
            i++;
        }
        while( i<=10); */ 

        //PRINTING TABLE USING DO WHILE

       /*  Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("TABLE : ");
        int i = 1;
        do{
            System.out.println(n + "*" + i + "=" + n*i);
            i++;
        }while(i<=10);*/

        // PROGRAM TO PRINT FIRST N NATURAL NUMBER 

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Limit : ");
        int n = sc.nextInt();
        int i = 1;
        System.out.println("The First "  +  n  +  " Natural Numbers are : ");
        do{
            System.out.println(i);
            i++;
        }while(i<=n);

        
    }
}
