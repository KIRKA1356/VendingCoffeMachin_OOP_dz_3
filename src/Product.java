public class Product {
    private String name;
    private double cost;
    private double volume;
    protected String measureUnit;

    public Product(String name, double cost, String measureUnit, double volume) {
        this.name = name;
        this.cost = cost;
        this.volume = volume;
        this.measureUnit = measureUnit;
    }
    public Product(String name, double volume, double cost) {
        this(name, volume, "ml", cost);
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public double getVolume() {
        return volume;
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public void getProductInfo(){
        String info = String.format("Имя: %s, Цена: %.2f, Объем: %.2f %s", this.getName(),this.getCost(),this.getVolume(), this.getMeasureUnit());
        System.out.println(info);
    }
}
