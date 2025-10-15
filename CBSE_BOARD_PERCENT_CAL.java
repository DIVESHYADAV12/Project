// PERCENTAGE CALCULATOR OF CBSE BOARD EXAM OF 5 SUBJECTS OUT OF 100 MARRKS
import java.util.Scanner;
public class CBSE_BOARD_PERCENT_CAL {
    public static void main(String_intro[] args)
    {
        System.out.println(" ENTER THE MARKS : ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Marks of Physics : ");
        float m1 = sc.nextFloat();
        System.out.print("Enter the Marks of Chemistry : ");
        float m2 = sc.nextFloat();
        System.out.print("Enter the Marks of Maths : ");
        float m3 = sc.nextFloat();
        System.out.print("Enter the Marks of English : ");
        float m4 = sc.nextFloat();
        System.out.print("Enter the Marks of Computer : ");
        float m5 = sc.nextFloat();
        float sum = m1+m2+m3+m4+m5;
        float per = (m1+m2+m3+m4+m5)/500*100;
        System.out.println("THE TOTAL MARKS OBTAINED IS !!! ");
        System.out.println(sum);
        System.out.println("THE PERCENTAGE OBTAINED IS !!! ");
        System.out.print(per);System.out.println("%");



    }
}
