
package abstractclothing;

import java.util.ArrayList;

public class AbstractClothing {

    public static void main(String[] args) {
        ArrayList<Clothing> inventory = new ArrayList<>();

        Store store = new Store();
        Pants pants = new Pants("Jeans", "Blue", 2, 23);
        
        Shirts shirt = new Shirts("T-shirt", "red", 1, 8);
        Jackets jacket = new Jackets("Nike Jacket", "black", 3, 45);
        Pants pants2 = new Pants("Joggers", "white", 7, 24);
        Shirts shirt2 = new Shirts("regular Shirt", "blue", 5, 12);
        Jackets jacket2 = new Jackets("Adidas Jacket", "pink", 8, 40);

        store.addClothes(pants);
        store.addClothes(shirt);
        store.addClothes(jacket);
        store.addClothes(pants2);
        store.addClothes(shirt2);
        store.addClothes(jacket2);
        
        System.out.println("Items in Store:\n"+store.toString());
        inventory.add(jacket);
        inventory.add(pants);
        inventory.add(shirt);
        inventory.add(pants2);
        inventory.add(shirt2);
        inventory.add(jacket2);
        inventory.remove(jacket);
        double total = 0;
        for(int i=0;i<inventory.size();i++){
            System.out.println(inventory.get(i));
           
        }
        
        if(inventory.size()< 10){
            System.out.println("Low Stock! Add more items to store");
        }

    }

}
