public class SentenciaContinue {
    public static void main(String[] args) {
        for (int i = 1; i<100; i++){
            if (i%2 != 0){
                continue;// Using in while, do while y for
            }
            System.out.println(i);
        }
    }
}
