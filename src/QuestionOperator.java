import java.util.Scanner;

public class QuestionOperator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int divider = sc.nextInt();
        System.out.println("Enter a number");
        int divisor = sc.nextInt();
        int result;
        /*if (divisor == 0){
            result = 0;
        }else{
            result= divider/divisor;
        }*/

        result = divisor == 0? 0 :divider/divisor;
        System.out.println("Resultado = "+result);
    }
}
