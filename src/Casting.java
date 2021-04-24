public class Casting {
    public static void main(String[] args) {
        int variableInt = 10;
        float variableFloat = variableInt;
        short variablrShort = 12;

        double variableDouble = variableFloat;
        double variableDouble2 = 2.76;
        int variableInt2 = (int)variableDouble2;

        System.out.println("Doible a Int " + variableInt2);

        byte var1 = 100;
        byte var2 = 5;
        byte sum = (byte)(var1 + var2);
        System.out.println("Casteo a byte es: " +sum);
    }
}
