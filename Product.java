package Homework;

public class Product {
    public String name;
    public Integer cost;
    public Double rating;

    public Product(String name, Integer cost, Double rating) {
        this.name = name;
        this.cost = cost;
        this.rating = rating;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "{" +
                "Наименование: '" + name + '\'' +
                ", Стоимость: " + cost +
                ", Рейтинг: " + rating +
                '}';
    }
}

