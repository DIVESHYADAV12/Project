public class exception {
    public static void main(String[] args) {
        int a=100;
        int b=0;
        try{
            int c = a/b;
            System.out.println("result :" + c);
        }
        catch(Exception e){
            System.out.println("we failed to produce result because :");
            System.out.println(e);
        }
        System.out.println("End of programme ....");
    }
}
