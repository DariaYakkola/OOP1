package Homework;

import java.util.*;

public class Shop {
    public Category name;
    public Basket basket;

    /**
     * @param catalog созданный каталог List<Category>
     * @apiNote показывает актуальный каталог показина
     */
    public static void ShowCatalog(List<Category> catalog) {
        System.out.println("АКТУАЛЬНЫЙ КАТАЛОГ МАГАЗИНА ");
        for (int i = 0; i < catalog.size(); i++) {
            System.out.println(catalog.get(i));
        }
    }

    /**
     * @param currentCatalog каталог магазина List<Category>
     * @return обновленный каталог магазина List<Category>
     * @apiNote предлагает пользователю добавлять товары, если ответ "да", то формирует список покупок
     * и добавляет выбранный продукт по индексу, выводит список покупок на экран, запускает метод NewCatalog
     */
    public static List<Category> addBasket(List<Category> currentCatalog) {
        List<Category> myBuy = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Хотите добавить товар? ");
        String answer = sc.nextLine().toLowerCase();
        while (answer.equals("да")) {
            System.out.println("Какой товар хотите добавить: ");
            Integer item = sc.nextInt();
            myBuy.add(currentCatalog.get(item));
            currentCatalog.remove(item);
            System.out.println("Хотите добавить еще товар? ");
            sc.nextLine();
            answer = sc.nextLine().toLowerCase();
        }
        for (int i = 0; i < myBuy.size(); i++) {
            System.out.println("Список покупок: ");
            System.out.println(myBuy.get(i));
        }
        return Shop.NewCatalog(currentCatalog, myBuy);
    }

    /**
     * @return каталог List<Category>
     * @apiNote формирует каталог
     */
    public static List<Category> CreateCatalog() {
        List<Category> catalog = new ArrayList<>();
        catalog.add(new Cloth("Одежда", new Product("блузка", 800, 4.9)));
        catalog.add(new Cloth("Одежда", new Product("толстовка", 400, 4.8)));
        catalog.add(new Cloth("Одежда", new Product("шорты", 400, 4.9)));
        catalog.add(new Cloth("Одежда", new Product("комбинезон", 500, 4.8)));
        catalog.add(new Phones("Телефоны", new Product("realme", 8900, 4.8)));
        catalog.add(new Phones("Телефоны", new Product("poco", 4800, 5.0)));
        catalog.add(new Phones("Телефоны", new Product("infinix", 6800, 4.8)));
        catalog.add(new Shoes("Обувь", new Product("сандалии", 3200, 4.8)));
        catalog.add(new Shoes("Обувь", new Product("шлепанцы", 1900, 4.8)));
        catalog.add(new Shoes("Обувь", new Product("кроссовки", 1600, 4.8)));
        return catalog;
    }

    /**
     * @param oldCatalog каталог List<Category>, который был до покупки
     * @param buy        список покупок List<Category>
     * @return измененный каталог  List<Category>
     * @apiNote Сравнивает каталог магазина и список покупок, удаляет купленные товары из каталога
     */
    public static List<Category> NewCatalog(List<Category> oldCatalog, List<Category> buy) {
        List<Category> newCatalog = new LinkedList<>();
        newCatalog.addAll(oldCatalog);
        newCatalog.removeAll(buy);
        return newCatalog;
    }
}



