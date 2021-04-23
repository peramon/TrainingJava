public class Informer { // Method overload

    public static final String COLOUR_BY_DEFAULT = "\u001B[0m";
    public static final String COLOUR_GREEN= "\u001B[32m";

    void showScreen(int i){
        System.out.println("Show integer: " + i);
    }

  /*  void showScreenDecimal(double d){
        System.out.printf("Decimal " + d);
    }*/
    void showScreen(double d){
        System.out.println("Show decimal: " +d);
    }

    void showScreen(String s){
        System.out.println("Show string: " +s);
    }

    void showScreen(String s, String color){
        System.out.println("Show string: " +s);
        System.out.printf(color + "Show word colour: " + s  );
    }

}
