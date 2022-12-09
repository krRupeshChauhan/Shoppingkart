package JavaProject;


//java beans
//product class to store product details
public class Product {
   private int id;
   private String name, brand;
   private double price;
  private  int quantity;
  public  Product(int id, String name,String brand,double price,int quantity)
  {
  super();
  this.id=id;
  this.name=name;
  this.brand=brand;
  this.price=price;
  this.quantity=quantity;
  }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



}




