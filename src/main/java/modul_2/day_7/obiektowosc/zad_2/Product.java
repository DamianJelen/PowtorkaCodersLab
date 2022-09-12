package modul_2.day_7.obiektowosc.zad_2;

public class Product {
    int id;
    String name;
    double price;
    static int nextId;

    public Product(String name, double price) {
        this.id = nextId;
        nextId++;
        this.name = name;
        setPrice(price);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        try {
            if (price >= 0.01) {
                this.price = price;
            } else {
                throw new IllegalArgumentException("error: The price must be greater then 0.");
            }
        } catch (IllegalArgumentException e) {
            this.price = 0.01;
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
