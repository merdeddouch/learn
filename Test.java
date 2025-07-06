import utils.FormatingImp;

public class Test {
    public static void main(String[] args){
        byte a = 2, b = 3;
        byte c = (byte) (a + b);
        System.out.println(c);
   
        // test fromating
        FormatingImp formatingImp = new FormatingImp();

        int inta = 234;
        int intb = 34;
        // ------------------------------------------------------------------
        System.out.println("{without casting} a/b :" +  inta/intb );
        System.out.println("{with casting} a/b :" + (float)inta/intb );
        System.out.println("{with formating ,00 } a/b :" + formatingImp.twoDigits( (float) inta/intb));
        System.out.println("{with formating ,0 } a/b :" + formatingImp.oneDigit( (float) inta/intb));

        // ------------------------------------------------------------------

        int price = 10;
        char status = 'N';

        switch (status) {
            case 'S':
                price+=20;
                break;
            case 'N':
                price +=10;
            case 'E':
                price = 0;
                break;
            default:
            System.out.println("no option");
                break;
        }

        System.out.println(price);

        switch (status) {
            case 'S' ->  price+=20;
            case 'N' -> price +=10;
            case 'E' ->    price = 0;
            default -> System.out.println("no option");            
        }

        System.out.println(price);


        // Case 1: String literals (automatically interned)

        String string1 = "aa";
        String string2 = "aa";

        System.out.println("string1 == string2: " + (string1 == string2));       // true
        System.out.println("string1.equals(string2): " + string1.equals(string2)); // true

        // Case 2: New object
        String string3 = new String("aa");
        System.out.println("string1 == string3: " + (string1 == string3));       // false
        System.out.println("string1.equals(string3): " + string1.equals(string3)); // true

        // Case 3: Interned new object
        String string4 = string3.intern();
        System.out.println("string1 == string4: " + (string1 == string4));       // true
        System.out.println("string1.equals(string4): " + string1.equals(string4)); // true

        // Optional: Show identity hash codes (reference-based)
        System.out.println("\nIdentity HashCodes:");
        System.out.println("string1: " + System.identityHashCode(string1));
        System.out.println("string2: " + System.identityHashCode(string2));
        System.out.println("string3: " + System.identityHashCode(string3));
        System.out.println("string4: " + System.identityHashCode(string4));
        
    }

    
}
