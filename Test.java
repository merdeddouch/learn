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



    }

    
}
