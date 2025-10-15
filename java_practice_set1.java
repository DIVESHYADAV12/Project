import java.util.Scanner;
public class java_practice_set1 {
    public static void main(String_intro[] args) {
        System.out.println("Enter the Subject marks : ");
        Scanner sc = new Scanner(System.in);
           System.out.print("Enter the marks of the Physics : ");
           Float a = sc.nextFloat();
           System.out.print("Enter the marks of the Chemistry : ");
           Float b = sc.nextFloat();
           System.out.print("Enter the marks of the Maths : ");
           Float c = sc.nextFloat();
           System.out.print("Enter the marks of the Computer : ");
           Float d = sc.nextFloat();
           System.out.print("Enter the marks of the English : ");
           Float e = sc.nextFloat();

           Float sum = a+b+c+d+e;
           Float percent = sum/5;
           System.out.println("The Total Marks Obtained is : " + sum);
           System.out.println("Percentage : " + percent);
           if(percent<33.33)
           {
            System.out.println("Result : Fail");
           }
            else
            {
                System.out.println("Result : Pass");
            }
           }
    }

