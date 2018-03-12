public class Hamburger {

     private String breadRollType;
     private String meat;
     private double price;
     private String name;

     private String addition1Name;
     private double addition1Price;

     private String addition2Name;
     private double addition2Price;




    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        this.name = name;
    }
    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }
    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + "roll "
        + "price is " + this.price);
        if (this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added "+this.addition1Name+" for an extra "+this.addition1Price);
        }
        if (this.addition2Name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added "+this.addition2Name+" for an extra "+this.addition2Price);
        }
        return hamburgerPrice;
    }
}
