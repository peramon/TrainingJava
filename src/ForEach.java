import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] numbers = {4,8,64,-6,5,45,12,89,45,120};
        int min, max;
        min = max = numbers[0];
        for (int i=1 ; i < numbers.length; i++){
            if(min>numbers[i]) min = numbers[i];
            if (max<numbers[i]) max = numbers[i];
        }
        System.out.println("Max: "+max+"   Min: "+min);

        min=max=numbers[0];
        for (int integer:numbers) {
            System.out.println("Interaction integer value -> " + integer);
            if(integer > max) max = integer;
            if(integer < min) min = integer;
        }
        System.out.println("Max: "+max+"   Min: "+min);

        int[][] arrayTwoD = {{4,5,6,8,7},{4,5,6,8,7},{7,8,2,9}};
        for (int[] array:arrayTwoD) {
            System.out.println("Interaction -> " + array.length);
        }
    }
}
