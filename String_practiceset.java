public class String_practiceset {
    public static void main(String[] args) {
        // 1.WRITE A JAVA PROGRAMME TO CONVERT A STRING TO LOWERCASE.

        String name = "This is the New String";
        System.out.println("Original String : " + name);
        System.out.println("New String : " + name.toLowerCase());

        // 2.WRITE A PROGRAMME TO REPLACE SPACE WITH UNDERSCORE.

        String str = "This is Macbook air M1";
        System.out.println("Original String : " + str);
        System.out.println("New String : " + str.replace(' ','_'));
        
        // 3.WRITE A JAVA PROGRAMME TO FILL IN A LETTER TEMPLATE WHICH LOOKS LIKE THIS 
        //   LETTER : "DEAR <|NAME|>, THANKS A LOT" 

        String letter = "DEAR <|NAME|>, THANKS A LOT";
        System.out.println("Original template : " + letter);
        System.out.println("Filled template : " + letter.replace("<|NAME|>","DIVESH"));

        // 4.WRITE A PROGRAMME TO DETECT DOUBLE AND TRIPPLE SPACES IN STRING.

        String spa = "This String  contains   doublr and   tripple spaces.";
        System.out.println("Original Sting : " + spa);
        System.out.println("Index of Double Space : " + spa.indexOf("  "));
        System.out.println("Index of Triple Space : " + spa.indexOf("   "));
        System.out.println("Trimed Sring : " + spa.trim());



    }
}
