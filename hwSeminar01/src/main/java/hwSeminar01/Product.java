package hwSeminar01;

public abstract class Product {
    protected String name;
    protected int cost;

    Product(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

    public String getInfoProduct(){
        return "Product " + name +
                " cost = " + cost;
    };
}
