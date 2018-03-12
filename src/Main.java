public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic","White","Sausage",
                4.56);
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.32);
        hamburger.addHamburgerAddition2("Onion", 0.13);
        System.out.println("Price of first hamburger is: " + hamburger.itemizeHamburger());
    }
}
