public class BoxMain {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>("Hola");

        Integer number = 5;
        Box<Integer> box2 = new Box<>(number);
        String myObject = "Dog";

        System.out.println(" The box1 contains a item object of the class equals " + box1.theContentBelongsToTheSameClass(myObject));
        System.out.println(" The box2 contains a item object of the class equals " + box2.theContentBelongsToTheSameClass(myObject));
    }
}
