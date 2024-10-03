package abstractclothing;

import java.util.ArrayList;

public class Store {
      ArrayList<Clothing> clothing;
      
      public Store() {
       clothing = new ArrayList<Clothing>();
    }
      public void addClothes(Clothing clothes) {
        clothing.add(clothes);
    }
       public String toString() {
        String temp ="";
        for(int i=0;i<clothing.size();i++){
            temp+= clothing.get(i).toString()+"\n";
        }
        return "\n"+temp;
    }

}
