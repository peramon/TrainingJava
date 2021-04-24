public class PracticeWithString {

    public static void main(String[] args) {
        String aString = new String("I am string");
        String otherString = new String(aString);
        String myThreeString = "This string";

        // Operations
        String myStr = "abcd";
        char character;
        character = myStr.charAt(2);
        System.out.println("Character in the position is " + character);

        String resultConcat = myStr.concat("efghij");
        System.out.println("The result concat is " +resultConcat);

        String resultConcatWithSum = myStr + "eFghij";
        System.out.println("The result concat is " +resultConcatWithSum);

        System.out.println("Are equals -> " + resultConcat.equals(resultConcatWithSum));
        System.out.println("Are equals with IngnireCase -> " + resultConcat.equalsIgnoreCase(resultConcatWithSum));
        System.out.println("Lenght -> " + resultConcat.length());
    }
}
