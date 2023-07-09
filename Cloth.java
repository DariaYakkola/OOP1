package Homework;

public class Cloth extends Category {
    public String name;
    public Product array;

    public Cloth(String name, Product array, String name1, Product array1) {
        super(name, array);
        this.name = name1;
        this.array = array1;
    }

    public Cloth(String name, Product array) {
        this.name = name;
        this.array = array;
    }

    @Override
    public String toString() {
        return "{" +
                "Категория:'" + name + '\'' +
                ", Описание товара " + array +
                '}';
    }
}