public class HotDrinks extends Product {
    private int temperature;

    public HotDrinks(String name, double volume, double price) {
        super(name, volume, price);
        this.temperature = 85;
    }

    public void getProductInfo() {
        super.getProductInfo();
        System.out.printf("Attention! Hot drink! Temperature: %d\n", this.temperature);
    }
}