import java.util.Scanner;
public class While_loop {
    public static void main(String_intro[] args)
    {
       /*  int n=0;
        while( n <= 10){
        System.out.println(n+1);
        n++; 
    }*/

    // PRINTING TABLE OF PROVIDED NUMBER

    Scanner sc = new Scanner(System.in);
    System.out.print("Provide a number for Printing the Table : ");
    int n = sc.nextInt();
    System.out.println("TABLE : ");
    int i = 1;
    while(i<=10){
    System.out.println(n + "*" + i + "=" + n*i);
    i++;
}


    }
}
