
package abstractclothing;

public abstract class Clothing {
    String name;
    String color;
    double quantity;
    double price;
    public Clothing(String name, String color, double quantity,double price){
        this.name = name;
        this.color = color;
        this.quantity = quantity;
        this.price = price;
    }
      public String getName() {
          return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public double getQuantity() {
        return this.quantity;
    }

    public double getPrice(double quantity,double price) {
        double total = quantity * price;
        return total;
    }
    public String toString() {
       
            return color+" "+name+"\n"+"quantity: "+quantity+"\nPrice: "+getPrice(quantity,price)+"\n-------------------";
        

    }
}
