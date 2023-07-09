package Homework;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Category> catalog = Category.CreateCatalog();
        Shop.ShowCatalog(catalog);
        List<Category> newCatalog = Shop.addBasket(catalog);
        Shop.ShowCatalog(newCatalog);
    }
}