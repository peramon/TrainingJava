public class ScopeOfTheVariable {
    public static void main(String[] args) {
        int days = 0;
        while (days < 30){
            days += 1;
            int weeks = days/7;
            System.out.println("Days " + days + " weeks " + weeks);
        }
        int years = days/365;
    }
}

