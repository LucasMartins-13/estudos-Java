public class Product {

    private String name;
    private double preco;

    public Product(String name, double preco) {
        this.name = name;
        this.preco = preco;
    }

    //getter and setter

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }


}