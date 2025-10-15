import java.util.*;
public class Array {
    public static void main(String[] args) {
        int [] marks = new int [5];
        Scanner sc =new Scanner (System.in);
        for (int i =0 ; i< 5;i++){
            System.out.println("Enter Marks of sub " + i+1 + " : ");
            marks[i] = sc.nextInt();

        }
        System.out.println("marks of student are : ");
        for (int i = 0; i<5 ; i++){
            System.out.println(marks[i]);

        }

    }
}
