import java.util.ArrayList;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> myShoppingList = new ArrayList<String>();
        myShoppingList.add("Potatoes");
        myShoppingList.add("Milks");
        myShoppingList.add("Apples");

        System.out.println("My list contains" + myShoppingList);

        ArrayList<String> myListJanuary = new ArrayList<String>(myShoppingList);

        myListJanuary.add("Flour");

        System.out.println("My list shopping " + myShoppingList + " My list of January " + myListJanuary);

        ArrayList<String> myListFebruary = myShoppingList;
        myListFebruary.add("Carrots");
        System.out.println("My list shopping " + myShoppingList + " My list of February " + myListFebruary);

        System.out.println("The first item on my January shopping list is " + myListJanuary.get(0));
        myListJanuary.set(1, "Whole milk");
        System.out.println("My list January " + myListJanuary);
        myListJanuary.remove(0);
        System.out.println("My list January " + myListJanuary);
        myListJanuary.remove("Flour");
        System.out.println("My list January " + myListJanuary);
        System.out.println("Size -> "+myListJanuary.size());

        for(String list: myListFebruary){
            System.out.println("Item -> " + list.toString());
        }
    }
}
