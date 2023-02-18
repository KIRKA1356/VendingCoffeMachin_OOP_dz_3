public class HotDrinks extends Product {
    private int temp;


    public HotDrinks(String name, double cost, double volume) {
        super(name, cost, volume);
        this.temp = 85;
    }
    public void getProductInfo() {
        super.getProductInfo();
        System.out.printf("Attention! Hot drink! Temperature: %d\n", this.temp);
    }

}
