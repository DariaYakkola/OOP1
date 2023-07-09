package Homework;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Category> myBasket;

    public Basket(List<Category> myBasket) {
        this.myBasket = myBasket;
    }

    public Basket() {
    }

    /**
     * @return список List<Basket> созданных корзин
     * @apiNote создает корзину для каждого пользователя
     */
    public static List<Basket> CreateBasket() {
        Basket basket1 = new Basket();
        Basket basket2 = new Basket();
        Basket basket3 = new Basket();
        List<Basket> baskets = new ArrayList<>();
        baskets.add(basket1);
        baskets.add(basket2);
        baskets.add(basket3);
        return baskets;
    }
}