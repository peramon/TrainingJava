public class Calculator {
    double calculateAreaOfCircle(double radius){
        return  Math.PI * radius * radius;

    }

    double calculateRectangularPrismVolume(double height, double width, double depht){
        return height*width*depht;
    }

    double calculateMean(double ... numbers){ // ... Undefined amount of data you can enter many
        if(numbers.length == 0) return 0;
        double sum =0.0;
        for (int i =0;i<numbers.length;i++){
            sum += numbers[i];
        }
        return sum/numbers.length;
    }
}
