public class Methhod_overloading {
    static void foo(){
     System.out.println("HII HELLO");
    }
    static void foo(int a)
    {
        System.out.println(a);
    }
    static int foo(int a, int b){
        
        return a+b;
    }
    public static void main(String_intro[] args) {
        foo();
        foo(5);
        int c=foo(2,78);
        System.out.println(c);
    }
}
