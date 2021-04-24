public class OneDimensionalArray {
    public static void main(String[] args) {
        String daysWeek[] = new String[7];
        daysWeek[0] = "Monday";
        daysWeek[1] = "Tuesday";
        daysWeek[2] = "Wenesday";
        daysWeek[3] = "Thursday";
        daysWeek[4] = "Friday";
        daysWeek[5] = "Saturday";
        daysWeek[6] = "Sunday";

        for (int i =0; i < daysWeek.length;i++) {
            System.out.println("Day -> " + daysWeek[i]);
        }

        int number[] = {4, 8, 3, 9, 21 ,7};
        int min, max;
        min = max = number[0];
        for (int i=1 ; i < number.length; i++){
            if(min>number[i]) min = number[i];
            if (max<number[i]) max = number[i];
        }
        System.out.println("Max: "+max+"   Min: "+min);

    }
}
