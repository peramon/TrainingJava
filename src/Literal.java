public class Literal {
    public static void main(String[] args) {
        int decimalInteger = 100;
        int octalInteger = 0100;
        int hexadecimalInteger = 0x100;

        System.out.println("Decimal integer: " +decimalInteger);
        System.out.println("Octal integer: " +octalInteger);
        System.out.println("Hexadecimal integer: " +hexadecimalInteger);

        long longNumber = 100L;
        double doubleNumer = 2.5;
        float floatNumber = 2.5f;
        int numberWithDashes = 20_254_44;

        System.out.println("The number with dashes " +numberWithDashes);

        char myChar = 'b';
        char myOtherChar = '\u0062';

        System.out.println("My character myOtherChar is "+myOtherChar);

        char singleQuotationMark = '\'';

        System.out.println("Single Quotation Mark "+singleQuotationMark);
        String stringLiteral = "This is a lteral";
        boolean boolTrue = true;
        String stringNull = null;

    }
}
